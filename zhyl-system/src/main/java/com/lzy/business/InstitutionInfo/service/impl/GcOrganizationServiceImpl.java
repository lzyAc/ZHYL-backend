package com.lzy.business.InstitutionInfo.service.impl;

import java.util.List;

import com.lzy.business.InstitutionInfo.service.IGcOrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lzy.business.InstitutionInfo.mapper.GcOrganizationMapper;
import com.lzy.business.InstitutionInfo.domain.GcOrganization;

/**
 * 养老机构信息Service业务层处理
 * 
 * @author lzy
 * @date 2024-11-20
 */
@Service
public class GcOrganizationServiceImpl implements IGcOrganizationService
{
    @Autowired
    private GcOrganizationMapper gcOrganizationMapper;

    /**
     * 查询养老机构信息
     * 
     * @param orgId 养老机构信息主键
     * @return 养老机构信息
     */
    @Override
    public GcOrganization selectGcOrganizationByOrgId(Long orgId)
    {
        return gcOrganizationMapper.selectGcOrganizationByOrgId(orgId);
    }

    /**
     * 查询养老机构信息列表
     * 
     * @param gcOrganization 养老机构信息
     * @return 养老机构信息
     */
    @Override
    public List<GcOrganization> selectGcOrganizationList(GcOrganization gcOrganization)
    {
        return gcOrganizationMapper.selectGcOrganizationList(gcOrganization);
    }

    /**
     * 新增养老机构信息
     * 
     * @param gcOrganization 养老机构信息
     * @return 结果
     */
    @Override
    public int insertGcOrganization(GcOrganization gcOrganization)
    {
        return gcOrganizationMapper.insertGcOrganization(gcOrganization);
    }

    /**
     * 修改养老机构信息
     * 
     * @param gcOrganization 养老机构信息
     * @return 结果
     */
    @Override
    public int updateGcOrganization(GcOrganization gcOrganization)
    {
        return gcOrganizationMapper.updateGcOrganization(gcOrganization);
    }

    /**
     * 批量删除养老机构信息
     * 
     * @param orgIds 需要删除的养老机构信息主键
     * @return 结果
     */
    @Override
    public int deleteGcOrganizationByOrgIds(Long[] orgIds)
    {
        return gcOrganizationMapper.deleteGcOrganizationByOrgIds(orgIds);
    }

    /**
     * 删除养老机构信息信息
     * 
     * @param orgId 养老机构信息主键
     * @return 结果
     */
    @Override
    public int deleteGcOrganizationByOrgId(Long orgId)
    {
        return gcOrganizationMapper.deleteGcOrganizationByOrgId(orgId);
    }
}
