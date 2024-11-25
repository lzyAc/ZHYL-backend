package com.lzy.business.InstitutionInfo.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
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
import com.lzy.common.annotation.Log;
import com.lzy.common.core.controller.BaseController;
import com.lzy.common.core.domain.AjaxResult;
import com.lzy.common.enums.BusinessType;
import com.lzy.business.InstitutionInfo.domain.gcServiceStaff;
import com.lzy.business.InstitutionInfo.service.IgcServiceStaffService;
import com.lzy.common.utils.poi.ExcelUtil;
import com.lzy.common.core.page.TableDataInfo;

/**
 * 服务人员管理Controller
 * 
 * @author lzy
 * @date 2024-11-25
 */
@RestController
@RequestMapping("/InstitutionInfo/staff")
public class gcServiceStaffController extends BaseController
{
    @Autowired
    private IgcServiceStaffService gcServiceStaffService;

    /**
     * 查询服务人员管理列表
     */
    @PreAuthorize("@ss.hasPermi('InstitutionInfo:staff:list')")
    @GetMapping("/list")
    public TableDataInfo list(gcServiceStaff gcServiceStaff)
    {
        startPage();
        List<gcServiceStaff> list = gcServiceStaffService.selectgcServiceStaffList(gcServiceStaff);
        return getDataTable(list);
    }

    /**
     * 导出服务人员管理列表
     */
    @PreAuthorize("@ss.hasPermi('InstitutionInfo:staff:export')")
    @Log(title = "服务人员管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, gcServiceStaff gcServiceStaff)
    {
        List<gcServiceStaff> list = gcServiceStaffService.selectgcServiceStaffList(gcServiceStaff);
        ExcelUtil<gcServiceStaff> util = new ExcelUtil<gcServiceStaff>(gcServiceStaff.class);
        util.exportExcel(response, list, "服务人员管理数据");
    }

    /**
     * 获取服务人员管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('InstitutionInfo:staff:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(gcServiceStaffService.selectgcServiceStaffById(id));
    }

    /**
     * 新增服务人员管理
     */
    @PreAuthorize("@ss.hasPermi('InstitutionInfo:staff:add')")
    @Log(title = "服务人员管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody gcServiceStaff gcServiceStaff)
    {
        return toAjax(gcServiceStaffService.insertgcServiceStaff(gcServiceStaff));
    }

    /**
     * 修改服务人员管理
     */
    @PreAuthorize("@ss.hasPermi('InstitutionInfo:staff:edit')")
    @Log(title = "服务人员管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody gcServiceStaff gcServiceStaff)
    {
        return toAjax(gcServiceStaffService.updategcServiceStaff(gcServiceStaff));
    }

    /**
     * 删除服务人员管理
     */
    @PreAuthorize("@ss.hasPermi('InstitutionInfo:staff:remove')")
    @Log(title = "服务人员管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(gcServiceStaffService.deletegcServiceStaffByIds(ids));
    }
}
