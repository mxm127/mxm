package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.DSItems;
import com.ruoyi.system.domain.dto.DsItemsDTO;

/**
 * itemsService接口
 * 
 * @author mxm
 * @date 2024-06-01
 */
public interface IDSItemsService 
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
    public List<DSItems> selectDSItemsList(DsItemsDTO dsItemsDTO);

    /**
     * 新增items
     * 
     * @param dsItemsDTO items
     * @return 结果
     */
    public int insertDSItems(DsItemsDTO dsItemsDTO);

    /**
     * 修改items
     * 
     * @param dsItemsDTO items
     * @return 结果
     */
    public int updateDSItems(DsItemsDTO dsItemsDTO);

    /**
     * 批量删除items
     * 
     * @param itemIds 需要删除的items主键集合
     * @return 结果
     */
    public int deleteDSItemsByItemIds(Long[] itemIds);

    /**
     * 删除items信息
     * 
     * @param itemId items主键
     * @return 结果
     */
    public int deleteDSItemsByItemId(Long itemId);

    int addPageView(Integer itemId);
}
