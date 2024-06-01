package com.ruoyi.system.service.impl;

import java.util.List;

import com.ruoyi.common.core.domain.BaseEntity;
import com.ruoyi.system.domain.dto.ItemSubDTO;
import com.ruoyi.system.mapper.ItemSubMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.domain.ItemSub;
import com.ruoyi.system.service.ItemSublistService;

/**
 * itemSubsService业务层处理
 * 
 * @author mxm
 * @date 2024-05-30
 */
@Service
public class ItemSublistServiceImpl implements ItemSublistService
{
    @Autowired
    private ItemSubMapper itemSubMapper;

    /**
     * 根据作品名称查看作品集
     * 
     * @param subId itemSubs主键
     * @return itemSubs
     */
    @Override
    public ItemSub selectItemSublistBySubId(Integer SubId)
    {
        return itemSubMapper.selectItemSubBySubId(SubId);
    }

    /**
     * 查询itemSubs列表
     * 
     * @param itemSubDTO itemSubs
     * @return itemSubs
     */
    @Override
    public List<ItemSub> selectItemSublistList(ItemSubDTO itemSubDTO)
    {
        ItemSub itemSub = new ItemSub();
        BeanUtils.copyProperties(itemSubDTO,itemSub);
        return itemSubMapper.selectItemSubList(itemSub);
    }

    /**
     * 新增itemSubs
     * 
     * @param itemSubDTO itemSubs
     * @return 结果
     */
    @Override
    public int insertItemSublist(ItemSubDTO itemSubDTO)
    {
        ItemSub itemSub = new ItemSub();
        BeanUtils.copyProperties(itemSubDTO,itemSub);
        return itemSubMapper.insertItemSub(itemSub);
    }

    /**
     * 修改itemSubs
     * 
     * @param itemSubDTO itemSubs
     * @return 结果
     */
    @Override
    public int updateItemSublist(ItemSubDTO itemSubDTO)
    {
        ItemSub itemSub = new ItemSub();
        BeanUtils.copyProperties(itemSubDTO,itemSub);
        return itemSubMapper.updateItemSub(itemSub);
    }

    /**
     * 批量删除itemSubs
     * 
     * @param subIds 需要删除的itemSubs主键
     * @return 结果
     */
    @Override
    public int deleteItemSublistBySubIds(Integer[] subIds)
    {
        return itemSubMapper.deleteItemSubBySubIds(subIds);
    }

    /**
     * 删除itemSubs信息
     * 
     * @param subId itemSubs主键
     * @return 结果
     */
    @Override
    public int deleteItemSublistBySubId(Integer subId)
    {
        return itemSubMapper.deleteItemSubBySubId(subId);
    }

    @Override
    public List<ItemSub> selectItemSublistByItemId(Integer itemId) {
        return itemSubMapper.selectItemSubListByItemId(itemId);
    }
}
