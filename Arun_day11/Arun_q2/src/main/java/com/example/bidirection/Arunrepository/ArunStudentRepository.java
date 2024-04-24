package com.example.bidirection.Arunrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bidirection.Arunvijaymodel.ArunStudent;



@Repository
public interface ArunStudentRepository extends JpaRepository<ArunStudent,Integer>{
    
}
