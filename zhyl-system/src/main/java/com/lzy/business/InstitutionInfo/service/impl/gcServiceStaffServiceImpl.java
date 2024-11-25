package com.lzy.business.InstitutionInfo.service.impl;

import java.util.List;
import com.lzy.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import com.lzy.common.utils.StringUtils;
import org.springframework.transaction.annotation.Transactional;
import com.lzy.business.InstitutionInfo.domain.gcOrganization;
import com.lzy.business.InstitutionInfo.mapper.gcServiceStaffMapper;
import com.lzy.business.InstitutionInfo.domain.gcServiceStaff;
import com.lzy.business.InstitutionInfo.service.IgcServiceStaffService;

/**
 * 服务人员管理Service业务层处理
 * 
 * @author lzy
 * @date 2024-11-25
 */
@Service
public class gcServiceStaffServiceImpl implements IgcServiceStaffService 
{
    @Autowired
    private gcServiceStaffMapper gcServiceStaffMapper;

    /**
     * 查询服务人员管理
     * 
     * @param id 服务人员管理主键
     * @return 服务人员管理
     */
    @Override
    public gcServiceStaff selectgcServiceStaffById(Long id)
    {
        return gcServiceStaffMapper.selectgcServiceStaffById(id);
    }

    /**
     * 查询服务人员管理列表
     * 
     * @param gcServiceStaff 服务人员管理
     * @return 服务人员管理
     */
    @Override
    public List<gcServiceStaff> selectgcServiceStaffList(gcServiceStaff gcServiceStaff)
    {
        return gcServiceStaffMapper.selectgcServiceStaffList(gcServiceStaff);
    }

    /**
     * 新增服务人员管理
     * 
     * @param gcServiceStaff 服务人员管理
     * @return 结果
     */
    @Transactional
    @Override
    public int insertgcServiceStaff(gcServiceStaff gcServiceStaff)
    {
        gcServiceStaff.setCreateTime(DateUtils.getNowDate());
        int rows = gcServiceStaffMapper.insertgcServiceStaff(gcServiceStaff);
        insertGcOrganization(gcServiceStaff);
        return rows;
    }

    /**
     * 修改服务人员管理
     * 
     * @param gcServiceStaff 服务人员管理
     * @return 结果
     */
    @Transactional
    @Override
    public int updategcServiceStaff(gcServiceStaff gcServiceStaff)
    {
        gcServiceStaff.setUpdateTime(DateUtils.getNowDate());
        gcServiceStaffMapper.deleteGcOrganizationByOrgId(gcServiceStaff.getId());
        insertGcOrganization(gcServiceStaff);
        return gcServiceStaffMapper.updategcServiceStaff(gcServiceStaff);
    }

    /**
     * 批量删除服务人员管理
     * 
     * @param ids 需要删除的服务人员管理主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deletegcServiceStaffByIds(Long[] ids)
    {
        gcServiceStaffMapper.deleteGcOrganizationByOrgIds(ids);
        return gcServiceStaffMapper.deletegcServiceStaffByIds(ids);
    }

    /**
     * 删除服务人员管理信息
     * 
     * @param id 服务人员管理主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deletegcServiceStaffById(Long id)
    {
        gcServiceStaffMapper.deleteGcOrganizationByOrgId(id);
        return gcServiceStaffMapper.deletegcServiceStaffById(id);
    }

    /**
     * 新增养老机构信息信息
     * 
     * @param gcServiceStaff 服务人员管理对象
     */
    public void insertGcOrganization(gcServiceStaff gcServiceStaff)
    {
        List<gcOrganization> gcOrganizationList = gcServiceStaff.getGcOrganizationList();
        Long id = gcServiceStaff.getId();
        if (StringUtils.isNotNull(gcOrganizationList))
        {
            List<gcOrganization> list = new ArrayList<gcOrganization>();
            for (com.lzy.business.InstitutionInfo.domain.gcOrganization gcOrganization : gcOrganizationList)
            {
                gcOrganization.setOrgId(id);
                list.add(gcOrganization);
            }
            if (list.size() > 0)
            {
                gcServiceStaffMapper.batchGcOrganization(list);
            }
        }
    }
}
