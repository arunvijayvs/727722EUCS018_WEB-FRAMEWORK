package com.example.day14ce1.Arunservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day14ce1.Arunmodel.ArunEmployee;
import com.example.day14ce1.Arunrepository.ArunEmployeeRepo;

@Service

public class ArunEmployeeService {
    @Autowired
    ArunEmployeeRepo employeeRepo;

    public ArunEmployee addEmployee(ArunEmployee employee)
    {
        return employeeRepo.save(employee);
    }

    public List<ArunEmployee> getEmployees()
    {
        return employeeRepo.findAll();
    }

    public Optional<ArunEmployee> getEmployee(Long employeeId)
    {
        return employeeRepo.findById(employeeId);
    }

}
