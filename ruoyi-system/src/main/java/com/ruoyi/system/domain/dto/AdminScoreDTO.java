package com.ruoyi.system.domain.dto;

public class AdminScoreDTO {
    private String Title;

    private String adjudicator;

    private String school;

    private String teachers;

    private String classType;

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getAdjudicator() {
        return adjudicator;
    }

    public void setAdjudicator(String adjudicator) {
        this.adjudicator = adjudicator;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getTeachers() {
        return teachers;
    }

    public void setTeachers(String teachers) {
        this.teachers = teachers;
    }

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }
}
