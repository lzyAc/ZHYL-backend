package com.lzy.business.InstitutionInfo.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lzy.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.lzy.common.annotation.Excel;

/**
 * 养老机构信息对象 gc_organization
 * 
 * @author lzy
 * @date 2024-11-20
 */
public class GcOrganization extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 机构 ID */
    private Long orgId;

    /** 机构名称 */
    @Excel(name = "机构名称")
    private String orgName;

    /** 机构地址 */
    @Excel(name = "机构地址")
    private String orgAddress;

    /** 机构简介 */
    @Excel(name = "机构简介")
    private String description;

    /** 机构图片路径 */
    @Excel(name = "机构图片路径")
    private String orgImage;

    /** 联系电话 */
    @Excel(name = "联系电话")
    private String contactPhone;

    /** 联系邮箱 */
    @Excel(name = "联系邮箱")
    private String contactEmail;

    /** 创建人 ID */
    @Excel(name = "创建人 ID")
    private Long createdBy;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createdTime;

    /** 修改人 ID */
    @Excel(name = "修改人 ID")
    private Long updatedBy;

    /** 修改时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "修改时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date updatedTime;

    public void setOrgId(Long orgId) 
    {
        this.orgId = orgId;
    }

    public Long getOrgId() 
    {
        return orgId;
    }
    public void setOrgName(String orgName) 
    {
        this.orgName = orgName;
    }

    public String getOrgName() 
    {
        return orgName;
    }
    public void setOrgAddress(String orgAddress) 
    {
        this.orgAddress = orgAddress;
    }

    public String getOrgAddress() 
    {
        return orgAddress;
    }
    public void setDescription(String description) 
    {
        this.description = description;
    }

    public String getDescription() 
    {
        return description;
    }
    public void setOrgImage(String orgImage) 
    {
        this.orgImage = orgImage;
    }

    public String getOrgImage() 
    {
        return orgImage;
    }
    public void setContactPhone(String contactPhone) 
    {
        this.contactPhone = contactPhone;
    }

    public String getContactPhone() 
    {
        return contactPhone;
    }
    public void setContactEmail(String contactEmail) 
    {
        this.contactEmail = contactEmail;
    }

    public String getContactEmail() 
    {
        return contactEmail;
    }
    public void setCreatedBy(Long createdBy) 
    {
        this.createdBy = createdBy;
    }

    public Long getCreatedBy() 
    {
        return createdBy;
    }
    public void setCreatedTime(Date createdTime) 
    {
        this.createdTime = createdTime;
    }

    public Date getCreatedTime() 
    {
        return createdTime;
    }
    public void setUpdatedBy(Long updatedBy) 
    {
        this.updatedBy = updatedBy;
    }

    public Long getUpdatedBy() 
    {
        return updatedBy;
    }
    public void setUpdatedTime(Date updatedTime) 
    {
        this.updatedTime = updatedTime;
    }

    public Date getUpdatedTime() 
    {
        return updatedTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("orgId", getOrgId())
            .append("orgName", getOrgName())
            .append("orgAddress", getOrgAddress())
            .append("description", getDescription())
            .append("orgImage", getOrgImage())
            .append("contactPhone", getContactPhone())
            .append("contactEmail", getContactEmail())
            .append("createdBy", getCreatedBy())
            .append("createdTime", getCreatedTime())
            .append("updatedBy", getUpdatedBy())
            .append("updatedTime", getUpdatedTime())
            .toString();
    }
}
