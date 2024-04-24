package com.example.springapp.Arunvijayrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.springapp.Arunvijaymodel.ArunRecipe;

import java.util.List;


@Repository
public interface ArunRecipeRepo extends JpaRepository<ArunRecipe,Integer>{

    @Query("select r from Recipe r where recipeName=?1")
    List<ArunRecipe> findByProduct(String name);
    
}
