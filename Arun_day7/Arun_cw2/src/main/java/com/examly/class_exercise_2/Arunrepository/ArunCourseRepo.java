package com.examly.class_exercise_2.Arunrepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.class_exercise_2.Arunmodel.ArunCourse;

@Repository
public interface ArunCourseRepo extends JpaRepository<ArunCourse, Integer> {

     List<ArunCourse> findByCourseName(String courseName);

}