package com.example.springapp.Arunvijayrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springapp.Arunvijaymodel.ArunProduct;

import java.util.List;


@Repository
public interface ArunProductRepo extends JpaRepository<ArunProduct,Integer>{

    List<ArunProduct> findByProductNameStartingWith(String name);
    List<ArunProduct> findByProductNameEndingWith(String name);
    
}
