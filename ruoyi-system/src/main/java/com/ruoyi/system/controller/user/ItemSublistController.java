package com.ruoyi.system.controller.user;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.ItemSub;
import com.ruoyi.system.domain.dto.ItemSubDTO;
import com.ruoyi.system.service.ItemSublistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * itemSubsController
 * 
 * @author mxm
 * @date 2024-05-30
 */
@RestController("userItemSublistController")
@RequestMapping("/user/biz/itemSubs")
public class ItemSublistController extends BaseController
{
    @Autowired
    private ItemSublistService itemSublistService;

    /**
     * 根据作品id查询itemSubs列表
     */
    @PreAuthorize("@ss.hasPermi('biz:itemSubs:list')")
    @GetMapping("/{itemId}")
    public TableDataInfo list(@PathVariable(value = "itemId") Integer itemId)
    {
        startPage();
        List<ItemSub> list = itemSublistService.selectItemSublistByItemId(itemId);
        return getDataTable(list);
    }

//    /**
//     * 查询itemSubs列表
//     */
//    @PreAuthorize("@ss.hasPermi('biz:itemSubs:list')")
//    @PostMapping("/list")
//    public TableDataInfo list(ItemSubDTO itemSubDTO)
//    {
//        startPage();
//        List<ItemSub> list = itemSublistService.selectItemSublistList(itemSubDTO);
//        return getDataTable(list);
//    }

//    /**
//     * 导出itemSubs列表
//     */
//    @PreAuthorize("@ss.hasPermi('biz:itemSubs:export')")
//    @Log(title = "itemSubs", businessType = BusinessType.EXPORT)
//    @PostMapping("/export")
//    public void export(HttpServletResponse response, ItemSubDTO itemSubDTO)
//    {
//        List<ItemSub> list = itemSublistService.selectItemSublistList(itemSubDTO);
//        ExcelUtil<ItemSub> util = new ExcelUtil<ItemSub>(ItemSub.class);
//        util.exportExcel(response, list, "itemSubs数据");
//    }
//
//    /**
//     * 获取itemSubs详细信息
//     */
//    @PreAuthorize("@ss.hasPermi('biz:itemSubs:query')")
//    @GetMapping(value = "/info/{subId}")
//    public AjaxResult getInfo(@PathVariable("ItemId") Integer SubId)
//    {
//        ItemSub itemSub = itemSublistService.selectItemSublistBySubId(SubId);
//        return success(itemSub);
//    }
//
    /**
     * 新增itemSubs
     */
    @PreAuthorize("@ss.hasPermi('biz:itemSubs:add')")
    @Log(title = "itemSubs", businessType = BusinessType.INSERT)
    @PostMapping("/insert")
    public AjaxResult add(@RequestBody ItemSubDTO itemSubDTO)
    {
        return toAjax(itemSublistService.insertItemSublist(itemSubDTO));
    }

//    /**
//     * 修改itemSubs
//     */
//    @PreAuthorize("@ss.hasPermi('biz:itemSubs:edit')")
//    @Log(title = "itemSubs", businessType = BusinessType.UPDATE)
//    @PutMapping("update")
//    public AjaxResult edit(@RequestBody ItemSubDTO itemSubDTO)
//    {
//        return toAjax(itemSublistService.updateItemSublist(itemSubDTO));
//    }
//
//    /**
//     * 批量删除itemSubs
//     */
//    @PreAuthorize("@ss.hasPermi('biz:itemSubs:remove')")
//    @Log(title = "itemSubs", businessType = BusinessType.DELETE)
//	@PostMapping("/deleteBatch")
//    public AjaxResult removeBatch(@RequestBody Integer[] subIds)
//    {
//        return toAjax(itemSublistService.deleteItemSublistBySubIds(subIds));
//    }
//
    /**
     * 删除itemSubs
     */
    @PreAuthorize("@ss.hasPermi('biz:itemSubs:remove')")
    @Log(title = "itemSubs", businessType = BusinessType.DELETE)
    @DeleteMapping("/delete/{subId}")
    public AjaxResult remove(@PathVariable(value = "subId") Integer subId)
    {
        Integer[] subIds = new Integer[1];
        subIds[0] = subId;
        return toAjax(itemSublistService.deleteItemSublistBySubIds(subIds));
    }
}
