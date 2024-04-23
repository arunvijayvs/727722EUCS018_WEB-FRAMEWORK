package com.example.springapp.Arunvijayrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springapp.Arunvijaymodel.ArunPerson;

import java.util.List;


@Repository
public interface ArunPersonRepo extends JpaRepository<ArunPerson,Integer>{

    List<ArunPerson> findByNameStartingWith(String name);
    List<ArunPerson> findByNameEndingWith(String name);
    
}
