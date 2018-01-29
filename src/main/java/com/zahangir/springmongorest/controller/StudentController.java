package com.zahangir.springmongorest.controller;

import com.zahangir.springmongorest.model.Student;
import com.zahangir.springmongorest.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/student/add")
    public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }

    @PutMapping("/student/add")
    public void updateStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }

    @GetMapping("/student/get/all")
    public List<Student> addStudent(){
        return studentService.getAllStudent();
    }

    @DeleteMapping("/student/delete/{id}")
    public void deleteStudent(@PathVariable("id") String  studentId){
        studentService.deleteStudent(studentId);
    }

    @GetMapping("/student/get/{name}")
    public Student getStudentById(@PathVariable("name") String  studentName){
        return studentService.getStudentByName(studentName);
    }
}
