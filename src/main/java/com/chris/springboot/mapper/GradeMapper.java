package com.chris.springboot.mapper;

import com.chris.springboot.entity.GradeEntity;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Chris on 2017/12/4.
 */

public interface GradeMapper {

    @Select("select * from grade where grade_nm=#{name}")
    List<GradeEntity> getByGradeNm(String name);

    @Insert("insert into grade(grade_nm,teacher_id) values(#{gradeNm},#{teacherId})")
    @Options(useGeneratedKeys=true,keyColumn="id",keyProperty="id")//设置id自增长
    void save(GradeEntity grade);

}