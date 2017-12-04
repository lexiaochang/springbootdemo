package com.chris.springboot.entity;

/**
 * Created by Chris on 2017/12/4.
 */


public class GradeEntity {

    private int    id;
    private String gradeNm;
    private String grade_nm;
    private int    teacherId;

    public String getGrade_nm() {
        return grade_nm;
    }

    public void setGrade_nm(String grade_nm) {
        this.grade_nm = grade_nm;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGradeNm() {
        return gradeNm;
    }

    public void setGradeNm(String gradeNm) {
        this.gradeNm = gradeNm;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }
}