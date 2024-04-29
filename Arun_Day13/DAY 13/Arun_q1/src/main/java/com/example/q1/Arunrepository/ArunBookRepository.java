package com.example.q1.Arunrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.q1.Arunmodel.ArunBook;
@Repository
public interface ArunBookRepository extends JpaRepository<ArunBook, Long> {
}
