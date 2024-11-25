package com.lzy.business.InstitutionInfo.service;

import java.util.List;
import com.lzy.business.InstitutionInfo.domain.gcServiceStaff;

/**
 * 服务人员管理Service接口
 * 
 * @author lzy
 * @date 2024-11-25
 */
public interface IgcServiceStaffService 
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
     * 批量删除服务人员管理
     * 
     * @param ids 需要删除的服务人员管理主键集合
     * @return 结果
     */
    public int deletegcServiceStaffByIds(Long[] ids);

    /**
     * 删除服务人员管理信息
     * 
     * @param id 服务人员管理主键
     * @return 结果
     */
    public int deletegcServiceStaffById(Long id);
}
