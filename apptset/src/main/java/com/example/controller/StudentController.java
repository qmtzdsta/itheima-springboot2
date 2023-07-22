package com.example.controller;


import com.example.domain.Student;
import com.example.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 去码头整点薯条
 * @since 2023-07-01
 */
@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentServiceImpl studentService;

    @RequestMapping("/login")
    public ModelAndView login(Student student){
        Student byId = studentService.getById(student.getId());
        String re = "";
        if (byId.getPassword().equals(student.getPassword())){
            re = "登录成功";
        } else {
            re = "用户名或者密码不正确";
        }
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject(re);
        modelAndView.setViewName("index");
        return modelAndView;
    }

}

