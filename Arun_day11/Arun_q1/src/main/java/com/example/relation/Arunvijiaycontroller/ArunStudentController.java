package com.example.relation.Arunvijiaycontroller;

import org.springframework.web.bind.annotation.RestController;

import com.example.relation.Arunvijaymodel.ArunStudent;
import com.example.relation.Arunvijayservice.ArunStudentService;

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
    @PostMapping("/api/student")
    public ArunStudent postMethodName(@RequestBody ArunStudent student) {
        return studentService.saveStudent(student);
    }
    @GetMapping("/api/student")
    public List<ArunStudent> getMethodName() {
        return studentService.getStudents();
    }
    
}
