package com.ruoyi.system.controller.admin;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.system.domain.Score;
import com.ruoyi.system.domain.dto.ScoreDTO;
import com.ruoyi.system.domain.vo.ScoreVO;
import com.ruoyi.system.service.IScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * scoreController
 * 
 * @author ruoyi
 * @date 2024-06-02
 */
@RestController
@RequestMapping("/admin/biz/score")
public class ScoreController extends BaseController
{
    @Autowired
    private IScoreService scoreService;

    /**
     * 查询score列表
     */
    @PreAuthorize("@ss.hasPermi('system:score:list')")
    @PostMapping("/itemScore")
    public TableDataInfo list(@RequestBody ScoreDTO scoreDTO)
    {
        startPage();
        List<ScoreVO> list = scoreService.selectScoreList(scoreDTO);
        return getDataTable(list);
    }

    /**
     * 导出score列表
     */
    @PreAuthorize("@ss.hasPermi('system:score:export')")
    @Log(title = "score", businessType = BusinessType.EXPORT)
    @PostMapping("/export")    /** 评分自增id */
    public void export(HttpServletResponse response, ScoreDTO scoreDTO)
    {
        List<ScoreVO> list = scoreService.selectScoreList(scoreDTO);
        ExcelUtil<ScoreVO> util = new ExcelUtil<ScoreVO>(ScoreVO.class);
        util.exportExcel(response, list, "score数据");
    }

    /**
     * 获取score详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:score:query')")
    @GetMapping(value = "/{itemId}")
    public AjaxResult getInfo(@PathVariable("itemId") Long itemId)
    {
        return success(scoreService.selectScoreById(itemId));
    }

//    /**
//     * 新增score
//     */
//    @PreAuthorize("@ss.hasPermi('system:score:add')")
//    @Log(title = "score", businessType = BusinessType.INSERT)
//    @PostMapping
//    public AjaxResult add(@RequestBody Score score)
//    {
//        return toAjax(scoreService.insertScore(score));
//    }
//
//    /**
//     * 修改score
//     */
//    @PreAuthorize("@ss.hasPermi('system:score:edit')")
//    @Log(title = "score", businessType = BusinessType.UPDATE)
//    @PutMapping
//    public AjaxResult edit(@RequestBody Score score)
//    {
//        return toAjax(scoreService.updateScore(score));
//    }

    /**
     * 删除score
     */
    @PreAuthorize("@ss.hasPermi('system:score:remove')")
    @Log(title = "score", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(scoreService.deleteScoreByIds(ids));
    }
}
