package com.examly.class_exercise_2.Arunservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.examly.class_exercise_2.Arunmodel.ArunCourse;
import com.examly.class_exercise_2.Arunrepository.ArunCourseRepo;

@Service
public class ArunCourseService {

     @Autowired
     public ArunCourseRepo courseRepo;

     public ArunCourse SaveEntity(ArunCourse entity) {
          return courseRepo.save(entity);

     }

     public List<ArunCourse> getDetails() {
          return courseRepo.findAll();

     }

     public List<ArunCourse> findByCourseName(String courseName) {
          return courseRepo.findByCourseName(courseName);
     }

}
