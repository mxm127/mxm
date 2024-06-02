package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.DsUser;
import com.ruoyi.system.domain.dto.DsUserDTO;
import com.ruoyi.system.domain.vo.DsUserVO;

/**
 * DsUserMapper接口
 * 
 * @author mxm
 * @date 2024-06-01
 */
public interface DsUserMapper 
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
     * @param dsUser DsUser
     * @return 结果
     */
    public int insertDsUser(DsUser dsUser);

    /**
     * 修改DsUser
     * 
     * @param dsUser DsUser
     * @return 结果
     */
    public int updateDsUser(DsUser dsUser);

    /**
     * 删除DsUser
     * 
     * @param id DsUser主键
     * @return 结果
     */
    public int deleteDsUserById(Long id);

    /**
     * 批量删除DsUser
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteDsUserByIds(Long[] ids);

    public DsUser selectDsUserByUserId(Long userId);
}
