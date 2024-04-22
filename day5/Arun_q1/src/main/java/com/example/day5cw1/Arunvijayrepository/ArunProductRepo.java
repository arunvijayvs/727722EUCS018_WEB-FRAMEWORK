package com.example.day5cw1.Arunvijayrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day5cw1.Arunmodel.ArunProduct;

@Repository
public interface ArunProductRepo extends JpaRepository<ArunProduct,Integer>{
    
}
