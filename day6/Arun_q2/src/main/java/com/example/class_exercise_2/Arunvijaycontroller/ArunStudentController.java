package com.example.class_exercise_2.Arunvijaycontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.class_exercise_2.Arunservice.ArunStudentService;
import com.example.class_exercise_2.Arunvijaymodel.ArunStudent;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class ArunStudentController {

     @Autowired
     public ArunStudentService studentService;

     @GetMapping("/api/student")
     public ResponseEntity<List<ArunStudent>> getDetails() {
          List<ArunStudent> list = studentService.getAll();
          if (list.isEmpty()) {
               return new ResponseEntity<List<ArunStudent>>(list, HttpStatus.NOT_FOUND);
          }
          return new ResponseEntity<List<ArunStudent>>(list, HttpStatus.OK);

     }

     @PostMapping("/api/student")
     public ResponseEntity<ArunStudent> postMethodName(@RequestBody ArunStudent student) {

          ArunStudent postData = studentService.post(student);
          return new ResponseEntity<>(postData, HttpStatus.OK);
     }

     @GetMapping("/api/student/sort/{field}")
     public ResponseEntity<List<ArunStudent>> sortedDetails(@PathVariable String field) {
          List<ArunStudent> list = studentService.sortedDetails(field);
          if (list.isEmpty()) {
               return new ResponseEntity<List<ArunStudent>>(list, HttpStatus.NOT_FOUND);
          }
          return new ResponseEntity<List<ArunStudent>>(list, HttpStatus.OK);

     }
}
