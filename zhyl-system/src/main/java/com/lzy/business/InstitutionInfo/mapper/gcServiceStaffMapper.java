package com.lzy.business.InstitutionInfo.mapper;

import java.util.List;
import com.lzy.business.InstitutionInfo.domain.gcServiceStaff;
import com.lzy.business.InstitutionInfo.domain.gcOrganization;

/**
 * 服务人员管理Mapper接口
 * 
 * @author lzy
 * @date 2024-11-25
 */
public interface gcServiceStaffMapper 
{
    /**
     * 查询服务人员管理
     * 
     * @param id 服务人员管理主键
     * @return 服务人员管理
     */
    public gcServiceStaff selectgcServiceStaffById(Long id);

    /**
     * 查询服务人员管理列表
     * 
     * @param gcServiceStaff 服务人员管理
     * @return 服务人员管理集合
     */
    public List<gcServiceStaff> selectgcServiceStaffList(gcServiceStaff gcServiceStaff);

    /**
     * 新增服务人员管理
     * 
     * @param gcServiceStaff 服务人员管理
     * @return 结果
     */
    public int insertgcServiceStaff(gcServiceStaff gcServiceStaff);

    /**
     * 修改服务人员管理
     * 
     * @param gcServiceStaff 服务人员管理
     * @return 结果
     */
    public int updategcServiceStaff(gcServiceStaff gcServiceStaff);

    /**
     * 删除服务人员管理
     * 
     * @param id 服务人员管理主键
     * @return 结果
     */
    public int deletegcServiceStaffById(Long id);

    /**
     * 批量删除服务人员管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deletegcServiceStaffByIds(Long[] ids);

    /**
     * 批量删除养老机构信息
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteGcOrganizationByOrgIds(Long[] ids);
    
    /**
     * 批量新增养老机构信息
     * 
     * @param gcOrganizationList 养老机构信息列表
     * @return 结果
     */
    public int batchGcOrganization(List<gcOrganization> gcOrganizationList);
    

    /**
     * 通过服务人员管理主键删除养老机构信息信息
     * 
     * @param id 服务人员管理ID
     * @return 结果
     */
    public int deleteGcOrganizationByOrgId(Long id);
}
