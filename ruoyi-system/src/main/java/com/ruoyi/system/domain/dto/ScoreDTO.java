package com.ruoyi.system.domain.dto;

import com.ruoyi.common.annotation.Excel;

public class ScoreDTO {
    /** 评分自增id */
    private Long id;

    /** 评价教师id */
    @Excel(name = "评价教师id")
    private Long adjudicatorId;

    /** 评价教师姓名 */
    @Excel(name = "评价教师姓名")
    private String adjudicator;

    /** 评价的范围*/
    private Integer classType;

    /**
     * 学校
     */
    private String school;

    /**
     * 参赛教师姓名
     */
    private String nickName;

    private Integer status;
}
