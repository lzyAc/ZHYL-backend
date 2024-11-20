package com.lzy.business.InstitutionInfo.mapper;

import java.util.List;
import com.lzy.business.InstitutionInfo.domain.GcOrganization;

/**
 * 养老机构信息Mapper接口
 * 
 * @author lzy
 * @date 2024-11-20
 */
public interface GcOrganizationMapper 
{
    /**
     * 查询养老机构信息
     * 
     * @param orgId 养老机构信息主键
     * @return 养老机构信息
     */
    public GcOrganization selectGcOrganizationByOrgId(Long orgId);

    /**
     * 查询养老机构信息列表
     * 
     * @param gcOrganization 养老机构信息
     * @return 养老机构信息集合
     */
    public List<GcOrganization> selectGcOrganizationList(GcOrganization gcOrganization);

    /**
     * 新增养老机构信息
     * 
     * @param gcOrganization 养老机构信息
     * @return 结果
     */
    public int insertGcOrganization(GcOrganization gcOrganization);

    /**
     * 修改养老机构信息
     * 
     * @param gcOrganization 养老机构信息
     * @return 结果
     */
    public int updateGcOrganization(GcOrganization gcOrganization);

    /**
     * 删除养老机构信息
     * 
     * @param orgId 养老机构信息主键
     * @return 结果
     */
    public int deleteGcOrganizationByOrgId(Long orgId);

    /**
     * 批量删除养老机构信息
     * 
     * @param orgIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteGcOrganizationByOrgIds(Long[] orgIds);
}
