package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.ItemSub;
import com.ruoyi.system.domain.dto.ItemSubDTO;

/**
 * itemSubsService接口
 * 
 * @author mxm
 * @date 2024-05-30
 */
public interface ItemSublistService
{
    /**
     * 查询itemSubs
     * 
     * @param subId itemSubs主键
     * @return itemSubs
     */
    public ItemSub selectItemSublistBySubId(Integer SubId);

    /**
     * 查询itemSubs列表
     * 
     * @param itemSubDTO itemSubs
     * @return itemSubs集合
     */
    public List<ItemSub> selectItemSublistList(ItemSubDTO itemSubDTO);

    /**
     * 新增itemSubs
     * 
     * @param itemSubDTO itemSubs
     * @return 结果
     */
    public int insertItemSublist(ItemSubDTO itemSubDTO);

    /**
     * 修改itemSubs
     * 
     * @param itemSubDTO itemSubs
     * @return 结果
     */
    public int updateItemSublist(ItemSubDTO itemSubDTO);

    /**
     * 批量删除itemSubs
     * 
     * @param subIds 需要删除的itemSubs主键集合
     * @return 结果
     */
    public int deleteItemSublistBySubIds(Integer[] subIds);

    /**
     * 删除itemSubs信息
     * 
     * @param subId itemSubs主键
     * @return 结果
     */
    public int deleteItemSublistBySubId(Integer subId);

    List<ItemSub> selectItemSublistByItemId(Integer itemId);
}
