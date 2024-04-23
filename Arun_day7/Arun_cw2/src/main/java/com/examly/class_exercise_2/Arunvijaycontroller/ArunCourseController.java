package com.examly.class_exercise_2.Arunvijaycontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.examly.class_exercise_2.Arunmodel.ArunCourse;
import com.examly.class_exercise_2.Arunservice.ArunCourseService;

@RestController
public class ArunCourseController {

     @Autowired
     public ArunCourseService CourseService;

     @PostMapping("/api/course")
     public ResponseEntity<ArunCourse> postMethodName(@RequestBody ArunCourse entity) {

          ArunCourse inst = CourseService.SaveEntity(entity);

          return new ResponseEntity<ArunCourse>(inst, HttpStatus.CREATED);

     }

     @GetMapping("/api/course")
     public ResponseEntity<List<ArunCourse>> getMethodName() {

          List<ArunCourse> show = CourseService.getDetails();
          if (!show.isEmpty()) {
               return new ResponseEntity<List<ArunCourse>>(show, HttpStatus.OK);
          } else {
               return new ResponseEntity<List<ArunCourse>>(show, HttpStatus.NOT_FOUND);
          }
     }

     @GetMapping("api/course/{courseName}")
     public List<ArunCourse> custom(@PathVariable String courseName) {
          return CourseService.findByCourseName(courseName);

     }
}