package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * DsUser对象 sys_ds_user
 * 
 * @author mxm
 * @date 2024-06-01
 */
public class DsUser extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 是否阅读须知 */
    @Excel(name = "是否阅读须知")
    private String readFlag;

    /** 学校名称 */
    @Excel(name = "学校名称")
    private String schoolName;

    /** 用户类型 */
    @Excel(name = "用户类型")
    private String userType;

    /** 名称 */
    @Excel(name = "名称")
    private String nickName;

    /** 关联主键 */
    @Excel(name = "关联主键")
    private Long userId;

    /** 参赛组别 */
    @Excel(name = "参赛组别")
    private String approveType;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setReadFlag(String readFlag) 
    {
        this.readFlag = readFlag;
    }

    public String getReadFlag() 
    {
        return readFlag;
    }
    public void setSchoolName(String schoolName) 
    {
        this.schoolName = schoolName;
    }

    public String getSchoolName() 
    {
        return schoolName;
    }
    public void setUserType(String userType) 
    {
        this.userType = userType;
    }

    public String getUserType() 
    {
        return userType;
    }
    public void setNickName(String nickName) 
    {
        this.nickName = nickName;
    }

    public String getNickName() 
    {
        return nickName;
    }
    public void setUserId(Long userId)
    {
        this.userId = userId;
    }

    public Long getUserId()
    {
        return userId;
    }
    public void setApproveType(String approveType) 
    {
        this.approveType = approveType;
    }

    public String getApproveType() 
    {
        return approveType;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("readFlag", getReadFlag())
            .append("schoolName", getSchoolName())
            .append("userType", getUserType())
            .append("nickName", getNickName())
            .append("userId", getUserId())
            .append("approveType", getApproveType())
            .toString();
    }
}
