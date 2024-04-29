package com.example.springapp.Aruncontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springapp.Arunmodel.ArunStudentDetail;
import com.example.springapp.Arunservice.ArunStudentDetailService;

@RestController
public class ArunStudentDetailController {
    @Autowired
    ArunStudentDetailService studentDetailService;
    
    @PostMapping("/studentDetail/student/{id}")
    public ResponseEntity<ArunStudentDetail> addStudentDetails(@PathVariable int id,@RequestBody ArunStudentDetail studentDetail)
    {
       return new ResponseEntity<>(studentDetailService.addStudentDetail(id,studentDetail),HttpStatus.CREATED);
    }
    
}
