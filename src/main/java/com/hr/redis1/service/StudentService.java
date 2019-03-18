package com.hr.redis1.service;

import com.hr.redis1.entity.Student;
import org.springframework.stereotype.Service;

import java.security.PrivateKey;
import java.util.List;

public interface StudentService {
  public List<Student> findAll();
  //清理缓存
  public void cleanCache();
}
