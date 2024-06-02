package com.ruoyi.system.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.ruoyi.common.core.domain.BaseEntity;
import com.ruoyi.common.core.domain.entity.SysUser;
import com.ruoyi.system.domain.dto.DsUserDTO;
import com.ruoyi.system.domain.vo.DsUserVO;
import com.ruoyi.system.mapper.SysUserMapper;
import com.ruoyi.system.service.ISysUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.DsUserMapper;
import com.ruoyi.system.domain.DsUser;
import com.ruoyi.system.service.IDsUserService;
import org.springframework.transaction.annotation.Transactional;

/**
 * DsUserService业务层处理
 * 
 * @author mxm
 * @date 2024-06-01
 */
@Service
public class DsUserServiceImpl implements IDsUserService 
{
    @Autowired
    private DsUserMapper dsUserMapper;

    @Autowired
    private SysUserMapper userMapper;

    /**
     * 查询DsUser
     * 
     * @param id DsUser主键
     * @return DsUser
     */
    @Override
    public DsUserVO selectDsUserById(Long id)
    {
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
    public List<DsUserVO> selectDsUserList(DsUserDTO dsUserDTO)
    {
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
    public int insertDsUser(DsUserDTO dsUserDTO)
    {
        DsUser user = new DsUser();
        BeanUtils.copyProperties(dsUserDTO,user);
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
    public int updateDsUser(DsUserDTO dsUserDTO)
    {
        DsUser user = new DsUser();
        BeanUtils.copyProperties(dsUserDTO,user);
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
    public int deleteDsUserByIds(Long[] ids)
    {
        return dsUserMapper.deleteDsUserByIds(ids);
    }

    /**
     * 删除DsUser信息
     * 
     * @param id DsUser主键
     * @return 结果
     */
    @Override
    public int deleteDsUserById(Long id)
    {
        return dsUserMapper.deleteDsUserById(id);
    }

    @Override
    public DsUser selectDsUserByUserId(Long userId) {
        return dsUserMapper.selectDsUserByUserId(userId);
    }
}
