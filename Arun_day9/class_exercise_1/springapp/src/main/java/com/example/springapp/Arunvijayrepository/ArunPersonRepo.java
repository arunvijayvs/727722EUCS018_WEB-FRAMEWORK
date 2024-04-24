package com.example.springapp.Arunvijayrepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.springapp.Arunvijaymodel.ArunPerson;

public interface ArunPersonRepo extends JpaRepository<ArunPerson, Integer> {
    @Query("SELECT p FROM Person p WHERE age=?1")
    List<ArunPerson> findByAge(int age);
}
