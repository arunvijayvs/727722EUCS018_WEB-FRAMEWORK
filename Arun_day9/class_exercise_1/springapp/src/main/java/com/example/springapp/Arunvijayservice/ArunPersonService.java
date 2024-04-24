package com.example.springapp.Arunvijayservice;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springapp.Arunvijaymodel.ArunPerson;
import com.example.springapp.Arunvijayrepository.ArunPersonRepo;

@Service
public class ArunPersonService {
    public ArunPersonRepo personRepo;

    public ArunPersonService(ArunPersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    public boolean savePerson(ArunPerson person) {
        try {
            personRepo.save(person);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public List<ArunPerson> getPersonByAge(int age) {
        return personRepo.findByAge(age);
    }
}
