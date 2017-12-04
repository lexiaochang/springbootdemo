package com.chris.springboot.controller;

import com.chris.springboot.entity.GradeEntity;
import com.chris.springboot.service.GradeService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

import javax.annotation.Resource;

/**
 * Created by Chris on 2017/12/4.
 */

@Controller
@RequestMapping("/gradeview")
public class GradeController {

    @Resource
    private GradeService gradeService;

    @ResponseBody
    @RequestMapping("/getByGradeNm")
    public List<GradeEntity> getByGradeNm(String name){
        return gradeService.getByGradeNm(name);
    }
}
