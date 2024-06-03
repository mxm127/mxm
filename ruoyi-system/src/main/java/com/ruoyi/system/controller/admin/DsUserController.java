package com.ruoyi.system.controller.admin;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.common.core.domain.entity.SysUser;
import com.ruoyi.system.domain.dto.DsUserDTO;
import com.ruoyi.system.domain.vo.DsUserVO;
import com.ruoyi.system.service.ISysUserService;
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
import com.ruoyi.system.domain.DsUser;
import com.ruoyi.system.service.IDsUserService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;
import org.springframework.web.multipart.MultipartFile;

/**
 * DsUserController
 * 
 * @author mxm
 * @date 2024-06-01
 */
@RestController("adminScoreController")
@RequestMapping("/admin/Dsuser")
public class DsUserController extends BaseController
{
    @Autowired
    private IDsUserService dsUserService;


    /**
     * 查询DsUser列表
     */
    @PreAuthorize("@ss.hasPermi('system:Dsuser:list')")
    @PostMapping("/list")
    public TableDataInfo list( @RequestBody DsUserDTO dsUserDTO)
    {
        startPage();
        List<DsUserVO> list = dsUserService.selectDsUserList(dsUserDTO);
        return getDataTable(list);
    }

    /**
     * 导出DsUser列表
     */
    @PreAuthorize("@ss.hasPermi('system:Dsuser:export')")
    @Log(title = "DsUser", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DsUserDTO dsUserDTO)
    {
        List<DsUserVO> list = dsUserService.selectDsUserList(dsUserDTO);
        ExcelUtil<DsUserVO> util = new ExcelUtil<DsUserVO>(DsUserVO.class);
        util.exportExcel(response, list, "DsUser数据");
    }

    /**
     * 获取DsUser详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:Dsuser:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(dsUserService.selectDsUserById(id));
    }

    /**
     * 导入教师数据
     * @param file
     * @param updateSupport
     * @return
     * @throws Exception
     */
    @PostMapping("/importData")
    public AjaxResult importData(MultipartFile file, boolean updateSupport) throws Exception
    {
        ExcelUtil<DsUserDTO> util = new ExcelUtil<DsUserDTO>(DsUserDTO.class);
        List<DsUserDTO> userList = util.importExcel(file.getInputStream());
        String operName = getUsername();
        String message = dsUserService.importDsUser(userList, updateSupport, operName);
        return success(message);
    }

    @PostMapping("/importTemplate")
    public void importTemplate(HttpServletResponse response)
    {
        ExcelUtil<DsUserVO> util = new ExcelUtil<DsUserVO>(DsUserVO.class);
        util.importTemplateExcel(response, "用户数据");
    }
    /**
     * 新增DsUser
     */
    @PreAuthorize("@ss.hasPermi('system:Dsuser:add')")
    @Log(title = "DsUser", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DsUserDTO dsUserDTO)
    {
        return toAjax(dsUserService.insertDsUser(dsUserDTO));
    }

    /**
     * 修改DsUser
     */
    @PreAuthorize("@ss.hasPermi('system:Dsuser:edit')")
    @Log(title = "DsUser", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DsUserDTO dsUserDTO)
    {
        return toAjax(dsUserService.updateDsUser(dsUserDTO));
    }

    /**
     * 删除DsUser
     */
    @PreAuthorize("@ss.hasPermi('system:Dsuser:remove')")
    @Log(title = "DsUser", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(dsUserService.deleteDsUserByIds(ids));
    }
}
