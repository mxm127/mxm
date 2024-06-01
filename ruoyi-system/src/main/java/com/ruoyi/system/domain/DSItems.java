package com.ruoyi.system.domain;

import java.util.List;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * dsitems对象 sys_items
 * 
 * @author mxm
 * @date 2024-05-30
 */
public class DSItems extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 自增id */
    private Integer itemId;


    /** 老师姓名 */
    @Excel(name = "老师姓名")
    private String teacher;

    /** 手机号 */
    @Excel(name = "手机号")
    private String phonenumber;

    /** 参赛表单 */
    @Excel(name = "参赛表单")
    private String entryForm;

    /** 提交时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "提交时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date commitTime;

    /** 学习 */
    @Excel(name = "学习")
    private String school;

    /** 信息 */
    @Excel(name = "信息")
    private String information;

    /** 标题 */
    @Excel(name = "标题")
    private String title;

    /** 子标题 */
    @Excel(name = "子标题")
    private String subTitle;


    /** 所属课程 */
    @Excel(name = "所属课程")
    private Long cource;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String createTimeLable;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long view;

    /** 封面 */
    @Excel(name = "封面")
    private String cover;

    /** 投票数 */
    @Excel(name = "投票数")
    private Long vote;

    /** 是否被评审 */
    @Excel(name = "是否被评审")
    private String status;

    /** 是否展示 */
    @Excel(name = "是否展示")
    private String exhibitFlag;

    /** 排序 */
    @Excel(name = "排序")
    private Long sortType;

    /** itemSubs信息 */
    private List<ItemSub> itemSublistList;

    /** 分类 */
    @Excel(name = "分类")
    private String classType;

    public void setItemId(Integer itemId)
    {
        this.itemId = itemId;
    }

    public Integer getItemId()
    {
        return itemId;
    }

    public void setTeacher(String teacher) 
    {
        this.teacher = teacher;
    }

    public String getTeacher() 
    {
        return teacher;
    }
    public void setPhonenumber(String phonenumber) 
    {
        this.phonenumber = phonenumber;
    }

    public String getPhonenumber() 
    {
        return phonenumber;
    }
    public void setEntryForm(String entryForm) 
    {
        this.entryForm = entryForm;
    }

    public String getEntryForm() 
    {
        return entryForm;
    }
    public void setCommitTime(Date commitTime) 
    {
        this.commitTime = commitTime;
    }

    public Date getCommitTime() 
    {
        return commitTime;
    }
    public void setSchool(String school) 
    {
        this.school = school;
    }

    public String getSchool() 
    {
        return school;
    }
    public void setInformation(String information) 
    {
        this.information = information;
    }

    public String getInformation() 
    {
        return information;
    }
    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
    }
    public void setSubTitle(String subTitle) 
    {
        this.subTitle = subTitle;
    }

    public String getSubTitle() 
    {
        return subTitle;
    }

    public void setCource(Long cource) 
    {
        this.cource = cource;
    }

    public Long getCource() 
    {
        return cource;
    }
    public void setCreateTimeLable(String createTimeLable) 
    {
        this.createTimeLable = createTimeLable;
    }

    public String getCreateTimeLable() 
    {
        return createTimeLable;
    }
    public void setView(Long view) 
    {
        this.view = view;
    }

    public Long getView() 
    {
        return view;
    }
    public void setCover(String cover) 
    {
        this.cover = cover;
    }

    public String getCover() 
    {
        return cover;
    }
    public void setVote(Long vote) 
    {
        this.vote = vote;
    }

    public Long getVote() 
    {
        return vote;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }
    public void setExhibitFlag(String exhibitFlag) 
    {
        this.exhibitFlag = exhibitFlag;
    }

    public String getExhibitFlag() 
    {
        return exhibitFlag;
    }
    public void setSortType(Long sortType) 
    {
        this.sortType = sortType;
    }

    public Long getSortType() 
    {
        return sortType;
    }

    public List<ItemSub> getItemSublistList()
    {
        return itemSublistList;
    }

    public void setItemSublistList(List<ItemSub> itemSublistList)
    {
        this.itemSublistList = itemSublistList;
    }

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("itemId", getItemId())
            .append("classType", getClassType())
            .append("teacher", getTeacher())
            .append("phonenumber", getPhonenumber())
            .append("entryForm", getEntryForm())
            .append("commitTime", getCommitTime())
            .append("school", getSchool())
            .append("information", getInformation())
            .append("title", getTitle())
            .append("subTitle", getSubTitle())
            .append("cource", getCource())
            .append("createBy", getCreateBy())
            .append("updateTime", getUpdateTime())
            .append("createTimeLable", getCreateTimeLable())
            .append("view", getView())
            .append("cover", getCover())
            .append("vote", getVote())
            .append("status", getStatus())
            .append("exhibitFlag", getExhibitFlag())
            .append("sortType", getSortType())
            .append("itemSublistList", getItemSublistList())
            .toString();
    }
}
