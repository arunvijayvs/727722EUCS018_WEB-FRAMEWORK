package com.example.springapp.Arunvijayservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.Arunvijaymodel.ArunPerson;
import com.example.springapp.Arunvijayrepository.ArunPersonRepo;

@Service
public class ArunPersonService {
    @Autowired
    private ArunPersonRepo rep;

    public boolean post(ArunPerson person)
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

    public List<ArunPerson> start(String value)
    {
        return rep.findByNameStartingWith(value);
    }

    public List<ArunPerson> end(String value)
    {
        return rep.findByNameEndingWith(value);
    }
    
}
