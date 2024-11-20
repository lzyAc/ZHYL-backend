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
import com.lzy.business.InstitutionInfo.domain.GcOrganization;
import com.lzy.business.InstitutionInfo.service.IGcOrganizationService;
import com.lzy.common.utils.poi.ExcelUtil;
import com.lzy.common.core.page.TableDataInfo;

/**
 * 养老机构信息Controller
 * 
 * @author lzy
 * @date 2024-11-20
 */
@RestController
@RequestMapping("/InstitutionInfo/organization")
public class GcOrganizationController extends BaseController
{
    @Autowired
    private IGcOrganizationService gcOrganizationService;

    /**
     * 查询养老机构信息列表
     */
    @PreAuthorize("@ss.hasPermi('InstitutionInfo:organization:list')")
    @GetMapping("/list")
    public TableDataInfo list(GcOrganization gcOrganization)
    {
        startPage();
        List<GcOrganization> list = gcOrganizationService.selectGcOrganizationList(gcOrganization);
        return getDataTable(list);
    }

    /**
     * 导出养老机构信息列表
     */
    @PreAuthorize("@ss.hasPermi('InstitutionInfo:organization:export')")
    @Log(title = "养老机构信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, GcOrganization gcOrganization)
    {
        List<GcOrganization> list = gcOrganizationService.selectGcOrganizationList(gcOrganization);
        ExcelUtil<GcOrganization> util = new ExcelUtil<GcOrganization>(GcOrganization.class);
        util.exportExcel(response, list, "养老机构信息数据");
    }

    /**
     * 获取养老机构信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('InstitutionInfo:organization:query')")
    @GetMapping(value = "/{orgId}")
    public AjaxResult getInfo(@PathVariable("orgId") Long orgId)
    {
        return success(gcOrganizationService.selectGcOrganizationByOrgId(orgId));
    }

    /**
     * 新增养老机构信息
     */
    @PreAuthorize("@ss.hasPermi('InstitutionInfo:organization:add')")
    @Log(title = "养老机构信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody GcOrganization gcOrganization)
    {
        return toAjax(gcOrganizationService.insertGcOrganization(gcOrganization));
    }

    /**
     * 修改养老机构信息
     */
    @PreAuthorize("@ss.hasPermi('InstitutionInfo:organization:edit')")
    @Log(title = "养老机构信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody GcOrganization gcOrganization)
    {
        return toAjax(gcOrganizationService.updateGcOrganization(gcOrganization));
    }

    /**
     * 删除养老机构信息
     */
    @PreAuthorize("@ss.hasPermi('InstitutionInfo:organization:remove')")
    @Log(title = "养老机构信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{orgIds}")
    public AjaxResult remove(@PathVariable Long[] orgIds)
    {
        return toAjax(gcOrganizationService.deleteGcOrganizationByOrgIds(orgIds));
    }
}
