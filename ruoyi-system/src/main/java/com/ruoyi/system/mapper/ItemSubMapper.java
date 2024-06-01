package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.ItemSub;

/**
 * sublistMapper接口
 * 
 * @author mxm
 * @date 2024-06-01
 */
public interface ItemSubMapper 
{
    /**
     * 查询sublist
     * 
     * @param subId sublist主键
     * @return sublist
     */
    public ItemSub selectItemSubBySubId(Integer subId);

    public List<ItemSub> selectItemSubListByItemId(Integer ItemId);

    /**
     * 查询sublist列表
     * 
     * @param itemSub sublist
     * @return sublist集合
     */
    public List<ItemSub> selectItemSubList(ItemSub itemSub);

    /**
     * 新增sublist
     * 
     * @param itemSub sublist
     * @return 结果
     */
    public int insertItemSub(ItemSub itemSub);

    /**
     * 修改sublist
     * 
     * @param itemSub sublist
     * @return 结果
     */
    public int updateItemSub(ItemSub itemSub);

    /**
     * 删除sublist
     * 
     * @param subId sublist主键
     * @return 结果
     */
    public int deleteItemSubBySubId(Integer subId);

    /**
     * 批量删除sublist
     * 
     * @param subIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteItemSubBySubIds(Integer[] subIds);
}
