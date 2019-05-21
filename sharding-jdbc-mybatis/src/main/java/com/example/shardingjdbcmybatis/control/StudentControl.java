package com.example.shardingjdbcmybatis.control;

import com.example.shardingjdbcmybatis.entity.Student;
import com.example.shardingjdbcmybatis.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@RequestMapping("/student")
@Controller
public class StudentControl {
    @Resource
    public StudentService studentService;

    @RequestMapping("/findall")
    @ResponseBody
    public List<Student> findAll(){
        return studentService.findAll();
    }
}
