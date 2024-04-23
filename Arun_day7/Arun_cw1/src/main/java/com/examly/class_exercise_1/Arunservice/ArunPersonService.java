package com.examly.class_exercise_1.Arunservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.examly.class_exercise_1.Arunvijaymodel.ArunPerson;
import com.examly.class_exercise_1.Arunvijayrepository.ArunPersonRepo;

@Service
public class ArunPersonService {

     @Autowired
     public ArunPersonRepo personRepo;

     public ArunPerson SaveEntity(ArunPerson entity) {
          return personRepo.save(entity);

     }

     public List<ArunPerson> getDetails() {
          return personRepo.findAll();

     }

     public List<ArunPerson> findByAge(int byAge) {
          return personRepo.findByAge(byAge);
     }

}
