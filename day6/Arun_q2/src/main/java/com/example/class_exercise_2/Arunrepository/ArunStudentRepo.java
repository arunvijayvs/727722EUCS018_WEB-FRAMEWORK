package com.example.class_exercise_2.Arunrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.class_exercise_2.Arunvijaymodel.ArunStudent;

@Repository
public interface ArunStudentRepo extends JpaRepository<ArunStudent, Integer> {

}