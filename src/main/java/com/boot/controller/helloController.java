package com.boot.controller;

import com.boot.pojo.Grade;
import com.boot.mapper.GradeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class helloController {
    @Autowired
    private GradeMapper gradeMapper;

    @RequestMapping("/hello")
    public List<Grade> hello(){
        return gradeMapper.selectList(null);
    }

    @RequestMapping("/addGrade")
    public List<Grade> add(){
        Grade grade = new Grade(null,"老二",1,1);
        int result = gradeMapper.insert(grade);
        System.out.println("影响行数 ：" + result);
        return gradeMapper.selectList(null);
    }

    @RequestMapping("/selectGrade")
    public Grade select(@RequestParam("id") Integer id){
        return gradeMapper.selectById(id);
    }

}
