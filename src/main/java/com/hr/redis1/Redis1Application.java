package com.hr.redis1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.Cacheable;

@SpringBootApplication
@MapperScan("com.hr.redis1.dao")
@Cacheable
//打开缓存
public class Redis1Application {

    public static void main(String[] args) {
        SpringApplication.run(Redis1Application.class, args);
    }

}
