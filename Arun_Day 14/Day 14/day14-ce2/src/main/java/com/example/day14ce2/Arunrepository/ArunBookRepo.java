package com.example.day14ce2.Arunrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day14ce2.Arunmodel.ArunBook;

@Repository
public interface ArunBookRepo extends JpaRepository<ArunBook,Integer> {
    
}
