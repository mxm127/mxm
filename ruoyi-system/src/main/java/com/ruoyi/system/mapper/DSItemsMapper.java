package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.DSItems;

/**
 * itemsMapper接口
 * 
 * @author mxm
 * @date 2024-06-01
 */
public interface DSItemsMapper 
{
    /**
     * 查询items
     * 
     * @param itemId items主键
     * @return items
     */
    public DSItems selectDSItemsByItemId(Long itemId);

    /**
     * 查询items列表
     * 
     * @param dSItems items
     * @return items集合
     */
    public List<DSItems> selectDSItemsList(DSItems dSItems);

    /**
     * 新增items
     * 
     * @param dSItems items
     * @return 结果
     */
    public int insertDSItems(DSItems dSItems);

    /**
     * 修改items
     * 
     * @param dSItems items
     * @return 结果
     */
    public int updateDSItems(DSItems dSItems);

    /**
     * 删除items
     * 
     * @param itemId items主键
     * @return 结果
     */
    public int deleteDSItemsByItemId(Long itemId);

    /**
     * 批量删除items
     * 
     * @param itemIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteDSItemsByItemIds(Long[] itemIds);

    int addView(Integer itemId);
}
