package com.ruoyi.system.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.ruoyi.common.annotation.DataScope;
import com.ruoyi.common.core.domain.BaseEntity;
import com.ruoyi.common.core.domain.entity.SysUser;
import com.ruoyi.common.exception.ServiceException;
import com.ruoyi.common.utils.SecurityUtils;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.common.utils.bean.BeanValidators;
import com.ruoyi.common.utils.spring.SpringUtils;
import com.ruoyi.system.domain.dto.DsUserDTO;
import com.ruoyi.system.domain.vo.DsUserVO;
import com.ruoyi.system.mapper.SysUserMapper;
import com.ruoyi.system.service.ISysConfigService;
import com.ruoyi.system.service.ISysUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.DsUserMapper;
import com.ruoyi.system.domain.DsUser;
import com.ruoyi.system.service.IDsUserService;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.Validator;

/**
 * DsUserService业务层处理
 *
 * @author mxm
 * @date 2024-06-01
 */
@Service
public class DsUserServiceImpl implements IDsUserService {

    private static final Logger log = LoggerFactory.getLogger(SysUserServiceImpl.class);
    @Autowired
    private DsUserMapper dsUserMapper;

    @Autowired
    private SysUserMapper userMapper;

    @Autowired
    private ISysConfigService configService;

    @Autowired
    protected Validator validator;

    /**
     * 查询DsUser
     *
     * @param id DsUser主键
     * @return DsUser
     */
    @Override
    public DsUserVO selectDsUserById(Long id) {
        DsUserVO dsUserVO = dsUserMapper.selectDsUserById(id);
        dsUserVO.setSysUser(userMapper.selectUserById(dsUserVO.getUserId()));
        return dsUserVO;
    }

    /**
     * 查询DsUser列表
     *
     * @param dsUserDTO DsUser
     * @return DsUser
     */
    @Override
    public List<DsUserVO> selectDsUserList(DsUserDTO dsUserDTO) {
        List<DsUserVO> dsUsers = dsUserMapper.selectDsUserList(dsUserDTO);
        for (DsUserVO dsUser : dsUsers) {
            SysUser user = userMapper.selectUserById(dsUser.getUserId());
            dsUser.setSysUser(user);
        }
        return dsUsers;
    }

    /**
     * 新增DsUser
     *
     * @param dsUserDTO DsUser
     * @return 结果
     */
    @Override
    @Transactional
    public int insertDsUser(DsUserDTO dsUserDTO) {
        DsUser user = new DsUser();
        BeanUtils.copyProperties(dsUserDTO, user);
        userMapper.insertUser(dsUserDTO.getSysUser());
        return dsUserMapper.insertDsUser(user);
    }

    /**
     * 修改DsUser
     *
     * @param dsUserDTO DsUser
     * @return 结果
     */
    @Override
    @Transactional
    public int updateDsUser(DsUserDTO dsUserDTO) {
        DsUser user = new DsUser();
        BeanUtils.copyProperties(dsUserDTO, user);
        userMapper.updateUser(dsUserDTO.getSysUser());
        return dsUserMapper.updateDsUser(user);
    }

    /**
     * 批量删除DsUser
     *
     * @param ids 需要删除的DsUser主键
     * @return 结果
     */
    @Override
    public int deleteDsUserByIds(Long[] ids) {
        return dsUserMapper.deleteDsUserByIds(ids);
    }

    /**
     * 删除DsUser信息
     *
     * @param id DsUser主键
     * @return 结果
     */
    @Override
    public int deleteDsUserById(Long id) {
        return dsUserMapper.deleteDsUserById(id);
    }

    /**
     * 根据用户id查找教师相关信息
     * @param userId
     * @return
     */
    @Override
    public DsUser selectDsUserByUserId(Long userId) {
        return dsUserMapper.selectDsUserByUserId(userId);
    }

    /**
     * 导入数据
     * @param userList
     * @param updateSupport
     * @param operName
     * @return
     */
    @Override
    public String importDsUser(List<DsUserDTO> userList, boolean isUpdateSupport, String operName) {

        if (StringUtils.isNull(userList) || userList.size() == 0) {
            throw new ServiceException("导入用户数据不能为空！");
        }
        int successNum = 0;
        int failureNum = 0;
        StringBuilder successMsg = new StringBuilder();
        StringBuilder failureMsg = new StringBuilder();
        String password = configService.selectConfigByKey("sys.user.initPassword");
        for (DsUserDTO userDTO : userList) {
            DsUser dsUser = new DsUser();
            BeanUtils.copyProperties(userDTO, dsUser);
            SysUser user = userDTO.getSysUser();
            try {
                // 验证是否存在这个用户
                SysUser u = userMapper.selectUserByUserName(userDTO.getSysUser().getUserName());

                if (StringUtils.isNull(u)) {
                    BeanValidators.validateWithException(validator, userDTO);
                    user.setPassword(SecurityUtils.encryptPassword(password));
                    user.setCreateBy(operName);
                    userMapper.insertUser(userDTO.getSysUser());
                    dsUserMapper.insertDsUser(dsUser);
                    successNum++;
                    successMsg.append("<br/>" + successNum + "、账号 " + userDTO.getSysUser().getUserName() + " 导入成功");
                } else if (isUpdateSupport) {
                    BeanValidators.validateWithException(validator, user);
                    checkUserAllowed(u);
                    checkUserDataScope(u.getUserId());
                    user.setUserId(u.getUserId());
                    user.setUpdateBy(operName);
                    userMapper.updateUser(user);
                    dsUserMapper.updateDsUser(dsUser);
                    successNum++;
                    successMsg.append("<br/>" + successNum + "、账号 " + user.getUserName() + " 更新成功");
                } else {
                    failureNum++;
                    failureMsg.append("<br/>" + failureNum + "、账号 " + user.getUserName() + " 已存在");
                }
            } catch (Exception e) {
                failureNum++;
                String msg = "<br/>" + failureNum + "、账号 " + user.getUserName() + " 导入失败：";
                failureMsg.append(msg + e.getMessage());
                log.error(msg, e);
            }
        }
        if (failureNum > 0) {
            failureMsg.insert(0, "很抱歉，导入失败！共 " + failureNum + " 条数据格式不正确，错误如下：");
            throw new ServiceException(failureMsg.toString());
        } else {
            successMsg.insert(0, "恭喜您，数据已全部导入成功！共 " + successNum + " 条，数据如下：");
        }
        return successMsg.toString();
    }
    public void checkUserAllowed(SysUser user) {
        if (StringUtils.isNotNull(user.getUserId()) && user.isAdmin()) {
            throw new ServiceException("不允许操作超级管理员用户");
        }
    }

    public void checkUserDataScope(Long userId)
    {
        if (!SysUser.isAdmin(SecurityUtils.getUserId()))
        {
            SysUser user = new SysUser();
            user.setUserId(userId);
            List<SysUser> users = SpringUtils.getAopProxy(this).selectUserList(user);
            if (StringUtils.isEmpty(users))
            {
                throw new ServiceException("没有权限访问用户数据！");
            }
        }
    }
    @DataScope(deptAlias = "d", userAlias = "u")
    public List<SysUser> selectUserList(SysUser user)
    {
        return userMapper.selectUserList(user);
    }
}



