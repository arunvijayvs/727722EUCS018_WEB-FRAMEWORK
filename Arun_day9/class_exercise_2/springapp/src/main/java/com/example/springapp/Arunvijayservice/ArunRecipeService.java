package com.example.springapp.Arunvijayservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.Arunvijaymodel.ArunRecipe;
import com.example.springapp.Arunvijayrepository.ArunRecipeRepo;

@Service
public class ArunRecipeService {
    @Autowired
    private ArunRecipeRepo rep;

  
    @SuppressWarnings("null")
    public boolean post(ArunRecipe recipe)
    {
        try
        {
            rep.save(recipe);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public ArunRecipe getByid(int id)
    {
        return rep.findById(id).orElse(null);
    }

    public List<ArunRecipe> filter(String name)
    {
        return rep.findByProduct(name);
    }
    
    
}
