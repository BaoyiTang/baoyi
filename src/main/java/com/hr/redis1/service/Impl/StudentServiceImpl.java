package com.hr.redis1.service.Impl;

import com.hr.redis1.dao.StudentMapper;
import com.hr.redis1.entity.Student;
import com.hr.redis1.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StudentServiceImpl implements StudentService {
   @Autowired
    private StudentMapper studentMapper;

 @Cacheable("151")
    public List<Student> findAll() {
     Map<String, Object> map = new HashMap<>();

     return studentMapper.selectByMap(map);
    }
    //清除缓存
  // @CacheEvict(value="151",key = "'StudentServiceImpl.findAll'")
    public void cleanCache() {
        System.out.println("清楚缓存");
    }
}
