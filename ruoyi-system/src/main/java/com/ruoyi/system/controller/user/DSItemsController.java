package com.ruoyi.system.controller.user;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.system.domain.DSItems;
import com.ruoyi.system.domain.dto.DsItemsDTO;
import com.ruoyi.system.service.IDSItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * dsitemsController
 * 
 * @author mxm
 * @date 2024-05-30
 */
@RestController("UserDsItemsController")
@RequestMapping("/User/biz/dsitems")
public class DSItemsController extends BaseController
{
    @Autowired
    private IDSItemsService dsItemsService;


    /**
     * 查询dsitems列表
     */
    @PreAuthorize("@ss.hasPermi('biz:dsitems:list')")
    @PostMapping("/list")
    public TableDataInfo list(@RequestBody DsItemsDTO dsItemsDTO)
    {
        List<DSItems> dsItems = dsItemsService.selectDSItemsList(dsItemsDTO);
        return getDataTable(dsItems);
    }

//    /**
//     * 导出dsitems列表
//     */
//    @PreAuthorize("@ss.hasPermi('biz:dsitems:export')")
//    @Log(title = "dsitems", businessType = BusinessType.EXPORT)
//    @PostMapping("/export")
//    public void export(HttpServletResponse response, DsItemsDTO dsItemsDTO)
//    {
//        List<DSItems> dsItems = dsItemsService.selectDSItemsList(dsItemsDTO);
//        ExcelUtil<DSItems> util = new ExcelUtil<DSItems>(DSItems.class);
//        util.exportExcel(response, dsItems, "dsitems数据");
//    }

    /**
     * 获取dsitems详细信息
     */
    @PreAuthorize("@ss.hasPermi('biz:dsitems:query')")
    @GetMapping(value = "/info/{itemId}")
    public AjaxResult getInfo(@PathVariable("itemId") Long itemId)
    {

        return success(dsItemsService.selectDSItemsByItemId(itemId));
    }

    /**
     * 新增dsitems
     */
    @PreAuthorize("@ss.hasPermi('biz:dsitems:add')")
    @Log(title = "dsitems", businessType = BusinessType.INSERT)
    @PostMapping("/insert")
    public AjaxResult add(@RequestBody DsItemsDTO dsItemsDTO)
    {
        return toAjax(dsItemsService.insertDSItems(dsItemsDTO));
    }

    /**
     * 修改dsitems
     */
    @PreAuthorize("@ss.hasPermi('biz:dsitems:edit')")
    @Log(title = "dsitems", businessType = BusinessType.UPDATE)
    @PutMapping("/update")
    public AjaxResult edit(@RequestBody DsItemsDTO dsItemsDTO)
    {
        return toAjax(dsItemsService.updateDSItems(dsItemsDTO));
    }

//    /**
//     * 删除dsitems
//     */
//    @PreAuthorize("@ss.hasPermi('biz:dsitems:remove')")
//    @Log(title = "dsitems", businessType = BusinessType.DELETE)
//	@PostMapping("/delete/{itemIds}")
//    public AjaxResult remove(@PathVariable Long itemId)
//    {
//        return toAjax(dsItemsService.deleteDSItemsByItemId(itemId));
//
//    }

//    /**
//     * 批量删除dsitems
//     */
//    @PreAuthorize("@ss.hasPermi('biz:dsitems:remove')")
//    @Log(title = "dsitems", businessType = BusinessType.DELETE)
//    @PostMapping("/deleteBatch/")
//    public AjaxResult removeBatch(@RequestBody Long[] itemIds)
//    {
//        return toAjax(dsItemsService.deleteDSItemsByItemIds(itemIds));
//    }

    /**
     * 浏览量+1
     * @param itemId
     * @return
     */
    @GetMapping("/pageview")
    public AjaxResult pageViewAdd(@PathVariable Integer itemId){
        return toAjax(dsItemsService.addPageView(itemId));

    }

}
