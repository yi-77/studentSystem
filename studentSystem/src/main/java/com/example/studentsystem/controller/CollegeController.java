package com.example.studentsystem.controller;

import com.example.studentsystem.domain.College;
import com.example.studentsystem.service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 学生基础信息表
 */

@RestController
@RequestMapping("/college")
public class CollegeController {

    @Autowired
    private CollegeService collegeService;

    @PostMapping("/addCollege")
    public void addCollege(@RequestBody College college) {
        // 处理添加院校的逻辑，例如将院校信息保存到数据库
        collegeService.save(college);
    }


}
