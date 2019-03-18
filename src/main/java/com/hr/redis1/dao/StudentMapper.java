package com.hr.redis1.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hr.redis1.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface StudentMapper extends BaseMapper<Student> {

}