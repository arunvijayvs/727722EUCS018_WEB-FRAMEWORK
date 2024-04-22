package com.example.day5cw2.Arunvijayrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day5cw2.Arunvijaymodel.ArunEmployee;


@Repository
public interface ArunEmployeeRepo extends JpaRepository<ArunEmployee,Integer>{
    
}
