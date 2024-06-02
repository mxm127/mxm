package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * score对象 sys_score
 * 
 * @author ruoyi
 * @date 2024-06-02
 */
public class Score extends BaseEntity
{
    private static final long serialVersionUID = 1L;

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

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setAdjudicatorId(Long adjudicatorId) 
    {
        this.adjudicatorId = adjudicatorId;
    }

    public Long getAdjudicatorId() 
    {
        return adjudicatorId;
    }
    public void setAdjudicator(String adjudicator) 
    {
        this.adjudicator = adjudicator;
    }

    public String getAdjudicator() 
    {
        return adjudicator;
    }
    public void setItemId(Long itemId) 
    {
        this.itemId = itemId;
    }

    public Long getItemId() 
    {
        return itemId;
    }
    public void setDimension1(Long dimension1) 
    {
        this.dimension1 = dimension1;
    }

    public Long getDimension1() 
    {
        return dimension1;
    }
    public void setDimension2(Long dimension2) 
    {
        this.dimension2 = dimension2;
    }

    public Long getDimension2() 
    {
        return dimension2;
    }
    public void setDimension3(Long dimension3) 
    {
        this.dimension3 = dimension3;
    }

    public Long getDimension3() 
    {
        return dimension3;
    }
    public void setDimension4(Long dimension4) 
    {
        this.dimension4 = dimension4;
    }

    public Long getDimension4() 
    {
        return dimension4;
    }
    public void setComments(String comments) 
    {
        this.comments = comments;
    }

    public String getComments() 
    {
        return comments;
    }
    public void setTotal(Long total) 
    {
        this.total = total;
    }

    public Long getTotal() 
    {
        return total;
    }
    public void setDimension5(Long dimension5) 
    {
        this.dimension5 = dimension5;
    }

    public Long getDimension5() 
    {
        return dimension5;
    }
    public void setDimension6(Long dimension6) 
    {
        this.dimension6 = dimension6;
    }

    public Long getDimension6() 
    {
        return dimension6;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("adjudicatorId", getAdjudicatorId())
            .append("adjudicator", getAdjudicator())
            .append("itemId", getItemId())
            .append("dimension1", getDimension1())
            .append("dimension2", getDimension2())
            .append("dimension3", getDimension3())
            .append("dimension4", getDimension4())
            .append("comments", getComments())
            .append("createTime", getCreateTime())
            .append("total", getTotal())
            .append("dimension5", getDimension5())
            .append("dimension6", getDimension6())
            .toString();
    }
}
