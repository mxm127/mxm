package com.ruoyi.system.domain.dto;

import com.ruoyi.common.annotation.Excel;

public class DsUserDTO {
    private static final long serialVersionUID = 1L;


    /** 用户是否阅读须知 */
    @Excel(name = "用户是否阅读须知")
    private Integer readFlag;

    /** 学校 */
    @Excel(name = "学校")
    private String schoolName;

    /** 用户类型 */
    @Excel(name = "用户类型")
    private String userType;

    /** 老师名称 */
    @Excel(name = "老师名称")
    private String nickName;

    /** 分类 */
    @Excel(name = "分类")
    private Long classType;

    /** 用户名 */
    @Excel(name = "用户名")
    private String userName;

    /** 密码 */
    @Excel(name = "密码")
    private String password;

    private int page;

    private int pageSize;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getReadFlag() {
        return readFlag;
    }

    public void setReadFlag(Integer readFlag) {
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

    public Long getClassType() {
        return classType;
    }

    public void setClassType(Long classType) {
        this.classType = classType;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
