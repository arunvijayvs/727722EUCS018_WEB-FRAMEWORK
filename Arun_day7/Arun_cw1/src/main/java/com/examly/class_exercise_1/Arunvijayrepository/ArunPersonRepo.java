package com.examly.class_exercise_1.Arunvijayrepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.class_exercise_1.Arunvijaymodel.ArunPerson;

/**
 * PersonRepo
 */
@Repository
public interface ArunPersonRepo extends JpaRepository<ArunPerson, Integer> {

     List<ArunPerson> findByAge(int byAge);
}