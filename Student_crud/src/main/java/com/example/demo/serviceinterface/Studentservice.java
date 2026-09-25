package com.example.demo.serviceinterface;

import java.util.List;

import com.example.demo.entity.Student;

public interface Studentservice {
   Student createStudents(Student student);
   List<Student> getAllStudents();
    Student getStudent(Long id);
    Student updateStudent(Long id,Student student);
    void deleteStudent(Long id);
    
   
	
}
