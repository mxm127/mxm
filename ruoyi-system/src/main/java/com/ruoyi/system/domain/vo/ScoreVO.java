package com.ruoyi.system.domain.vo;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import io.lettuce.core.dynamic.annotation.Param;

public class ScoreVO extends BaseEntity {
    /** 评分自增id */
    private Long id;

    /** 评价教师id */
    @Excel(name = "评价教师id")
    private Long adjudicatorId;

    /** 评价教师姓名 */
    @Excel(name = "评价教师姓名")
    private String adjudicator;

    /** 关联作品主键 */
    @Excel(name = "关联作品主键")
    private Long itemId;

    /** 得分1 */
    @Excel(name = "得分1")
    private Long dimension1;

    /** 得分2 */
    @Excel(name = "得分2")
    private Long dimension2;

    /** 得分3 */
    @Excel(name = "得分3")
    private Long dimension3;

    /** 得分4 */
    @Excel(name = "得分4")
    private Long dimension4;

    /** 评价 */
    @Excel(name = "评价")
    private String comments;

    /** 总分 */
    @Excel(name = "总分")
    private Long total;

    /** 得分5 */
    @Excel(name = "得分5")
    private Long dimension5;

    /** 得分6 */
    @Excel(name = "得分6")
    private Long dimension6;


    private String title;

    private Integer classType;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getClassType() {
        return classType;
    }

    public void setClassType(Integer classType) {
        this.classType = classType;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAdjudicatorId() {
        return adjudicatorId;
    }

    public void setAdjudicatorId(Long adjudicatorId) {
        this.adjudicatorId = adjudicatorId;
    }

    public String getAdjudicator() {
        return adjudicator;
    }

    public void setAdjudicator(String adjudicator) {
        this.adjudicator = adjudicator;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getDimension1() {
        return dimension1;
    }

    public void setDimension1(Long dimension1) {
        this.dimension1 = dimension1;
    }

    public Long getDimension2() {
        return dimension2;
    }

    public void setDimension2(Long dimension2) {
        this.dimension2 = dimension2;
    }

    public Long getDimension3() {
        return dimension3;
    }

    public void setDimension3(Long dimension3) {
        this.dimension3 = dimension3;
    }

    public Long getDimension4() {
        return dimension4;
    }

    public void setDimension4(Long dimension4) {
        this.dimension4 = dimension4;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Long getDimension5() {
        return dimension5;
    }

    public void setDimension5(Long dimension5) {
        this.dimension5 = dimension5;
    }

    public Long getDimension6() {
        return dimension6;
    }

    public void setDimension6(Long dimension6) {
        this.dimension6 = dimension6;
    }
}
