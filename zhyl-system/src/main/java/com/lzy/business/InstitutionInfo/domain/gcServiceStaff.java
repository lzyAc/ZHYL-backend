package com.lzy.business.InstitutionInfo.domain;

import java.util.List;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lzy.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.lzy.common.annotation.Excel;

/**
 * 服务人员管理对象 gc_service_staff
 * 
 * @author lzy
 * @date 2024-11-25
 */
public class gcServiceStaff extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 服务人员ID */
    private Long id;

    /** 服务人员姓名 */
    @Excel(name = "服务人员姓名")
    private String staffName;

    /** 性别 (M: 男, F: 女) */
    @Excel(name = "性别 (M: 男, F: 女)")
    private String gender;

    /** 联系电话 */
    @Excel(name = "联系电话")
    private String phoneNumber;

    /** 邮箱 */
    @Excel(name = "邮箱")
    private String email;

    /** 所属机构ID，关联gc_organization表 */
    @Excel(name = "所属机构ID，关联gc_organization表")
    private Long orgId;

    /** 职位 */
    @Excel(name = "职位")
    private String position;

    /** 入职日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "入职日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date hireDate;

    /** 状态 (active: 在职, inactive: 离职) */
    @Excel(name = "状态 (active: 在职, inactive: 离职)")
    private String status;

    /** 创建人 ID */
    @Excel(name = "创建人 ID")
    private Long createdBy;

    /** 修改人 ID */
    @Excel(name = "修改人 ID")
    private Long updatedBy;

    /** 养老机构信息信息 */
    private List<gcOrganization> gcOrganizationList;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setStaffName(String staffName) 
    {
        this.staffName = staffName;
    }

    public String getStaffName() 
    {
        return staffName;
    }
    public void setGender(String gender) 
    {
        this.gender = gender;
    }

    public String getGender() 
    {
        return gender;
    }
    public void setPhoneNumber(String phoneNumber) 
    {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() 
    {
        return phoneNumber;
    }
    public void setEmail(String email) 
    {
        this.email = email;
    }

    public String getEmail() 
    {
        return email;
    }
    public void setOrgId(Long orgId) 
    {
        this.orgId = orgId;
    }

    public Long getOrgId() 
    {
        return orgId;
    }
    public void setPosition(String position) 
    {
        this.position = position;
    }

    public String getPosition() 
    {
        return position;
    }
    public void setHireDate(Date hireDate) 
    {
        this.hireDate = hireDate;
    }

    public Date getHireDate() 
    {
        return hireDate;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }
    public void setCreatedBy(Long createdBy) 
    {
        this.createdBy = createdBy;
    }

    public Long getCreatedBy() 
    {
        return createdBy;
    }
    public void setUpdatedBy(Long updatedBy) 
    {
        this.updatedBy = updatedBy;
    }

    public Long getUpdatedBy() 
    {
        return updatedBy;
    }

    public List<gcOrganization> getGcOrganizationList()
    {
        return gcOrganizationList;
    }

    public void setGcOrganizationList(List<gcOrganization> gcOrganizationList)
    {
        this.gcOrganizationList = gcOrganizationList;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("staffName", getStaffName())
            .append("gender", getGender())
            .append("phoneNumber", getPhoneNumber())
            .append("email", getEmail())
            .append("orgId", getOrgId())
            .append("position", getPosition())
            .append("hireDate", getHireDate())
            .append("status", getStatus())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("createdBy", getCreatedBy())
            .append("updatedBy", getUpdatedBy())
            .append("gcOrganizationList", getGcOrganizationList())
            .toString();
    }
}
