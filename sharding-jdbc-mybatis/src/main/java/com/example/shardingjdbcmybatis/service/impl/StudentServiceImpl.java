package com.example.shardingjdbcmybatis.service.impl;

import com.example.shardingjdbcmybatis.entity.Student;
import com.example.shardingjdbcmybatis.mapper.StudentMapper;
import com.example.shardingjdbcmybatis.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    public StudentMapper userMapper;

    @Override
    public boolean insert(Student student) {
        return userMapper.insert(student) > 0 ? true :false;
    }

    @Override
    public List<Student> findAll() {
        return userMapper.findAll();
    }
}
