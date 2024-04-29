package com.example.ce1.Arunservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ce1.Arunmodel.ArunEmployee;
import com.example.ce1.Arunrepository.ArunEmployeeRepo;

@Service
public class ArunEmployeeService {
    @Autowired
    ArunEmployeeRepo employeeRepo;

    @SuppressWarnings("null")
    public ArunEmployee setEmployee(ArunEmployee employee)
    {
        return employeeRepo.save(employee);
    }

    public List<ArunEmployee> getInnerEmployee()
    {
        return employeeRepo.getByInnerEmployees();
    }

    public List<ArunEmployee> getLeftOuterEmployee()
    {
        return employeeRepo.getByLeftOuterEmployees();
    }
}
