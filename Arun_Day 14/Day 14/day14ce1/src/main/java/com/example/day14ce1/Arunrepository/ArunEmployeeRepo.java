package com.example.day14ce1.Arunrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day14ce1.Arunmodel.ArunEmployee;

@Repository
public interface ArunEmployeeRepo extends JpaRepository<ArunEmployee,Long> {
    
}
