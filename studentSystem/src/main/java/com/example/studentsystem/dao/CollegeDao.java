package com.example.studentsystem.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.studentsystem.domain.College;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface CollegeDao extends BaseMapper<College> {

}
