package com.example.bidirection.Arunvijaycontroller;

import org.springframework.web.bind.annotation.RestController;

import com.example.bidirection.Arunvijaymodel.ArunStudent;
import com.example.bidirection.Arunvijaymodel.ArunStudentInfo;
import com.example.bidirection.Arunvijayservice.ArunStudentService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class ArunStudentController {
    public ArunStudentService studentService;
    public ArunStudentController(ArunStudentService studentService)
    {
        this.studentService = studentService;
    }
    @PostMapping("/api/poststudent")
    public ArunStudent postMethodName(@RequestBody ArunStudent student) {
        return studentService.saveStudent(student);
    }
    @PostMapping("/api/poststudentinfo")
    public ArunStudentInfo postMethodName(@RequestBody ArunStudentInfo studentInfo) {
        return studentService.saveStudentInfo(studentInfo);
    }
    @GetMapping("/api/student")
    public List<ArunStudent> getMethodName() {
        return studentService.getStudents();
    }
    
}