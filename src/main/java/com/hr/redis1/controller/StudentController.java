package com.hr.redis1.controller;

import com.hr.redis1.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @RequestMapping("/findAll")
   public ModelAndView findAll(){
       System.out.println("666666lhl");
       System.out.println("666666lhl");
       System.out.println("666666lhl");
        ModelAndView mv=new ModelAndView("/index");
      mv.addObject("studentList",studentService.findAll());
      return mv;
   }
   //清楚缓存
    @RequestMapping("/cleanCache")
    public ModelAndView cleanCache(){
        studentService.cleanCache();
        ModelAndView mv=new ModelAndView("/index");
        return mv;
    }
}
