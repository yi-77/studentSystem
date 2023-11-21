package com.example.studentsystem.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.studentsystem.dao.CollegeDao;
import com.example.studentsystem.domain.College;
import com.example.studentsystem.service.CollegeService;
import org.springframework.stereotype.Service;


@Service
public class CollegeServiceImpl extends ServiceImpl<CollegeDao,College> implements CollegeService {

}
