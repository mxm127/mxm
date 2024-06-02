package com.ruoyi.system.service.impl;

import java.time.LocalDateTime;
import java.util.List;

import com.github.pagehelper.PageHelper;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.system.domain.dto.DsItemsDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.DSItemsMapper;
import com.ruoyi.system.domain.DSItems;
import com.ruoyi.system.service.IDSItemsService;

/**
 * itemsService业务层处理
 * 
 * @author mxm
 * @date 2024-06-01
 */
@Service
public class DSItemsServiceImpl implements IDSItemsService 
{
    @Autowired
    private DSItemsMapper dSItemsMapper;

    /**
     * 查询items
     * 
     * @param itemId items主键
     * @return items
     */
    @Override
    public DSItems selectDSItemsByItemId(Long itemId)
    {
        return dSItemsMapper.selectDSItemsByItemId(itemId);
    }

    /**
     * 查询items列表
     * 
     * @param dSItems items
     * @return items
     */
    @Override
    public List<DSItems> selectDSItemsList(DsItemsDTO dsItemsDTO)
    {
        PageHelper.startPage(dsItemsDTO.getPage(),dsItemsDTO.getPageSize());
        DSItems dsItems = new DSItems();
        BeanUtils.copyProperties(dsItemsDTO,dsItems);
        return dSItemsMapper.selectDSItemsList(dsItems);
    }

    /**
     * 新增items
     * 
     * @param dsItemsDTO items
     * @return 结果
     */
    @Override
    public int insertDSItems(DsItemsDTO dsItemsDTO)
    {
        DSItems dsItems = new DSItems();
        BeanUtils.copyProperties(dsItemsDTO,dsItems);
        return dSItemsMapper.insertDSItems(dsItems);
    }

    /**
     * 修改items
     * 
     * @param dsItemsDTO items
     * @return 结果
     */
    @Override
    public int updateDSItems(DsItemsDTO dsItemsDTO)
    {
        DSItems dsItems = new DSItems();
        BeanUtils.copyProperties(dsItemsDTO,dsItems);
        dsItems.setUpdateTime(DateUtils.getNowDate());
        return dSItemsMapper.updateDSItems(dsItems);
    }

    /**
     * 批量删除items
     * 
     * @param itemIds 需要删除的items主键
     * @return 结果
     */
    @Override
    public int deleteDSItemsByItemIds(Long[] itemIds)
    {
        return dSItemsMapper.deleteDSItemsByItemIds(itemIds);
    }

    /**
     * 删除items信息
     * 
     * @param itemId items主键
     * @return 结果
     */
    @Override
    public int deleteDSItemsByItemId(Long itemId)
    {
        return dSItemsMapper.deleteDSItemsByItemId(itemId);
    }

    @Override
    public int addPageView(Integer itemId) {

        return dSItemsMapper.addView(itemId);
    }
}
