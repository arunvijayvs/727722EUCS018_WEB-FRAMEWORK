package com.example.relation.Arunvijayrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.relation.Arunvijaymodel.ArunStudentInfo;

@Repository
public interface ArunStudentInfoRepository extends JpaRepository<ArunStudentInfo,Integer>{
    
}