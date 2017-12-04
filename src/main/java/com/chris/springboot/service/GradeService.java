package com.chris.springboot.service;

import com.chris.springboot.entity.GradeEntity;
import com.chris.springboot.mapper.GradeMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Chris on 2017/12/4.
 */

@Service
public class GradeService {

    @Autowired
    private GradeMapper gradeMapper;

    public List<GradeEntity> getByGradeNm(String name){
        return gradeMapper.getByGradeNm(name);
    }

}