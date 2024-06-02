package com.ruoyi.system.controller.user;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.system.domain.dto.ScoreDTO;
import com.ruoyi.system.domain.vo.ScoreVO;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.Score;
import com.ruoyi.system.service.IScoreService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * scoreController
 * 
 * @author ruoyi
 * @date 2024-06-02
 */
@RestController("userScoreController")
@RequestMapping("/user/biz/score")
public class ScoreController extends BaseController
{
    @Autowired
    private IScoreService scoreService;

    /**
     * 查询评委需要评价的score列表
     */
    @PreAuthorize("@ss.hasPermi('system:score:list')")
    @PostMapping("/list")
    public TableDataInfo list(@RequestBody ScoreDTO scoreDTO)
    {
        startPage();
        List<ScoreVO> list = scoreService.selectScoreList(scoreDTO);
        return getDataTable(list);
    }
//
//    /**
//     * 导出score列表
//     */
//    @PreAuthorize("@ss.hasPermi('system:score:export')")
//    @Log(title = "score", businessType = BusinessType.EXPORT)
//    @PostMapping("/export")
//    public void export(HttpServletResponse response, Score score)
//    {
//        List<Score> list = scoreService.selectScoreList(score);
//        ExcelUtil<Score> util = new ExcelUtil<Score>(Score.class);
//        util.exportExcel(response, list, "score数据");
//    }

    /**
     * 获取score详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:score:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(scoreService.selectScoreById(id));
    }

    /**
     * 新增score
     */
    @PreAuthorize("@ss.hasPermi('system:score:add')")
    @Log(title = "score", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    public AjaxResult add(@RequestBody Score score)
    {
        return toAjax(scoreService.insertScore(score));
    }

    /**
     * 修改score
     */
    @PreAuthorize("@ss.hasPermi('system:score:edit')")
    @Log(title = "score", businessType = BusinessType.UPDATE)
    @PutMapping("/edit")
    public AjaxResult edit(@RequestBody Score score)
    {
        return toAjax(scoreService.updateScore(score));
    }

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
