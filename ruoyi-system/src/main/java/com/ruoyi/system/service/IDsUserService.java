package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.DsUser;
import com.ruoyi.system.domain.dto.DsUserDTO;
import com.ruoyi.system.domain.vo.DsUserVO;

/**
 * DsUserService接口
 * 
 * @author mxm
 * @date 2024-06-01
 */
public interface IDsUserService 
{
    /**
     * 查询DsUser
     * 
     * @param id DsUser主键
     * @return DsUser
     */
    public DsUserVO selectDsUserById(Long id);

    /**
     * 查询DsUser列表
     * 
     * @param dsUserDTO DsUser
     * @return DsUser集合
     */
    public List<DsUserVO> selectDsUserList(DsUserDTO dsUserDTO);

    /**
     * 新增DsUser
     * 
     * @param dsUserDTO DsUser
     * @return 结果
     */
    public int insertDsUser(DsUserDTO dsUserDTO);

    /**
     * 修改DsUser
     * 
     * @param dsUserDTO DsUser
     * @return 结果
     */
    public int updateDsUser(DsUserDTO dsUserDTO);

    /**
     * 批量删除DsUser
     * 
     * @param ids 需要删除的DsUser主键集合
     * @return 结果
     */
    public int deleteDsUserByIds(Long[] ids);

    /**
     * 删除DsUser信息
     * 
     * @param id DsUser主键
     * @return 结果
     */
    public int deleteDsUserById(Long id);

    /**
     * 根据用户id查询教师相关信息
     * @param userId
     * @return
     */
    public DsUser selectDsUserByUserId(Long userId);

    /**
     * 导入教师相关信息
     * @param userList
     * @param updateSupport
     * @param operName
     * @return
     */
    String importDsUser(List<DsUserDTO> userList, boolean updateSupport, String operName);
}
