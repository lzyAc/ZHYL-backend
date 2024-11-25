package com.lzy.business.InstitutionInfo.service;

import java.util.List;
import com.lzy.business.InstitutionInfo.domain.gcOrganization;

/**
 * 养老机构信息Service接口
 * 
 * @author lzy
 * @date 2024-11-20
 */
public interface IGcOrganizationService 
{
    /**
     * 查询养老机构信息
     * 
     * @param orgId 养老机构信息主键
     * @return 养老机构信息
     */
    public gcOrganization selectGcOrganizationByOrgId(Long orgId);

    /**
     * 查询养老机构信息列表
     * 
     * @param gcOrganization 养老机构信息
     * @return 养老机构信息集合
     */
    public List<gcOrganization> selectGcOrganizationList(gcOrganization gcOrganization);

    /**
     * 新增养老机构信息
     * 
     * @param gcOrganization 养老机构信息
     * @return 结果
     */
    public int insertGcOrganization(gcOrganization gcOrganization);

    /**
     * 修改养老机构信息
     * 
     * @param gcOrganization 养老机构信息
     * @return 结果
     */
    public int updateGcOrganization(gcOrganization gcOrganization);

    /**
     * 批量删除养老机构信息
     * 
     * @param orgIds 需要删除的养老机构信息主键集合
     * @return 结果
     */
    public int deleteGcOrganizationByOrgIds(Long[] orgIds);

    /**
     * 删除养老机构信息信息
     * 
     * @param orgId 养老机构信息主键
     * @return 结果
     */
    public int deleteGcOrganizationByOrgId(Long orgId);
}
