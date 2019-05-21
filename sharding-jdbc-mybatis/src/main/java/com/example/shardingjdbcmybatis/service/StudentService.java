package com.example.shardingjdbcmybatis.service;

import com.example.shardingjdbcmybatis.entity.Student;

import java.util.List;

public interface StudentService {
    boolean insert(Student student);

    List<Student> findAll();
}
