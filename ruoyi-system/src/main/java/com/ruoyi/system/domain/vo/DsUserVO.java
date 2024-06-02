package com.ruoyi.system.domain.vo;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.entity.SysUser;

public class DsUserVO {
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 是否阅读须知 */
    private String readFlag;

    /** 学校名称 */
    @Excel(name = "学校名称")
    private String schoolName;

    /** 用户类型 */
    @Excel(name = "用户类型")
    private String userType;

    /** 教师姓名 */
    @Excel(name = "教师姓名")
    private String nickName;

    /** 用户id */
    @Excel(name = "用户id")
    private Long userId;

    private String approveType;

    public String getApproveType() {
        return approveType;
    }

    public void setApproveType(String approveType) {
        this.approveType = approveType;
    }

    private SysUser sysUser;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReadFlag() {
        return readFlag;
    }

    public void setReadFlag(String readFlag) {
        this.readFlag = readFlag;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public SysUser getSysUser() {
        return sysUser;
    }

    public void setSysUser(SysUser sysUser) {
        this.sysUser = sysUser;
    }
}
