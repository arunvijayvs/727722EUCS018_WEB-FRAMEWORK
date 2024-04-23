package com.example.class_exercise_2.Arunservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.class_exercise_2.Arunrepository.ArunStudentRepo;
import com.example.class_exercise_2.Arunvijaymodel.ArunStudent;

@Service
public class ArunStudentService {

     @Autowired
     public ArunStudentRepo studentRepo;

     public List<ArunStudent> getAll() {
          return studentRepo.findAll();
     }

     public ArunStudent post(ArunStudent student) {
          return studentRepo.save(student);
     }

     public List<ArunStudent> sortedDetails(String field) {
          return studentRepo.findAll(Sort.by(Sort.Direction.DESC, field));
     }
}
