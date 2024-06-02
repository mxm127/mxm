package com.ruoyi.system.domain.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import com.ruoyi.system.domain.ItemSub;

import java.util.Date;
import java.util.List;

//@EqualsAndHashCode(callSuper = true)
//@Data
public class DsItemsDTO extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /** 自增id */
    private Integer itemId;

    /** 一级分类 */
    @Excel(name = "一级分类")
    private String classone;

    /** 二级分类 */
    @Excel(name = "二级分类")
    private String classtwo;

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

    /** 一级分类名称 */
    @Excel(name = "一级分类名称")
    private String classoneName;

    /** 二级分类名称 */
    @Excel(name = "二级分类名称")
    private String classtwoName;

    /** 所属课程 */
    @Excel(name = "所属课程")
    private Long course;

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


//    private Score score;

    private int page;

    private int pageSize;

    private List<ItemSub> itemSubList;

    public List<ItemSub> getItemSubList() {
        return itemSubList;
    }

    public void setItemSubList(List<ItemSub> itemSubList) {
        this.itemSubList = itemSubList;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getClassone() {
        return classone;
    }

    public void setClassone(String classone) {
        this.classone = classone;
    }

    public String getClasstwo() {
        return classtwo;
    }

    public void setClasstwo(String classtwo) {
        this.classtwo = classtwo;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEntryForm() {
        return entryForm;
    }

    public void setEntryForm(String entryForm) {
        this.entryForm = entryForm;
    }

    public Date getCommitTime() {
        return commitTime;
    }

    public void setCommitTime(Date commitTime) {
        this.commitTime = commitTime;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getClassoneName() {
        return classoneName;
    }

    public void setClassoneName(String classoneName) {
        this.classoneName = classoneName;
    }

    public String getClasstwoName() {
        return classtwoName;
    }

    public void setClasstwoName(String classtwoName) {
        this.classtwoName = classtwoName;
    }

    public Long getCourse() {
        return course;
    }

    public void setCourse(Long course) {
        this.course = course;
    }

    public String getCreateTimeLable() {
        return createTimeLable;
    }

    public void setCreateTimeLable(String createTimeLable) {
        this.createTimeLable = createTimeLable;
    }

    public Long getView() {
        return view;
    }

    public void setView(Long view) {
        this.view = view;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public Long getVote() {
        return vote;
    }

    public void setVote(Long vote) {
        this.vote = vote;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getExhibitFlag() {
        return exhibitFlag;
    }

    public void setExhibitFlag(String exhibitFlag) {
        this.exhibitFlag = exhibitFlag;
    }

    public Long getSortType() {
        return sortType;
    }

    public void setSortType(Long sortType) {
        this.sortType = sortType;
    }



//    public Score getScore() {
//        return score;
//    }
//
//    public void setScore(Score score) {
//        this.score = score;
//    }

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


}
