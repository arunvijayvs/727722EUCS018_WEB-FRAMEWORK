package com.example.springapp.Arunvijayservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.springapp.Arunvijaymodel.ArunProduct;
import com.example.springapp.Arunvijayrepository.ArunProductRepo;

@Service
public class ArunProductService {
    @Autowired
    private ArunProductRepo rep;

    @SuppressWarnings("null")
    public boolean post(ArunProduct person)
    {
        try
        {
            rep.save(person);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public List<ArunProduct> start(String value)
    {
        return rep.findByProductNameStartingWith(value);
    }

    public List<ArunProduct> end(String value)
    {
        return rep.findByProductNameEndingWith(value);
    }
    public List<ArunProduct> sort()
    {
        return rep.findAll(Sort.by("price"));
    }
    
}
