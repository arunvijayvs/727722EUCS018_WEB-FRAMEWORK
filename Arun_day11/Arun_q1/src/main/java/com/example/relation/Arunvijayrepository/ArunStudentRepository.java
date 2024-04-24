package com.example.relation.Arunvijayrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.relation.Arunvijaymodel.ArunStudent;

@Repository
public interface ArunStudentRepository extends JpaRepository<ArunStudent,Integer>{
    
}
