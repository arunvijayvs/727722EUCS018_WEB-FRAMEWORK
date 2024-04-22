package com.example.day5cw2.Arunvijayservice;

import org.springframework.stereotype.Service;

import com.example.day5cw2.Arunvijaymodel.ArunEmployee;
import com.example.day5cw2.Arunvijayrepository.ArunEmployeeRepo;

@Service
public class ArunEmployeeService {
    public ArunEmployeeRepo employeeRepo;
    public ArunEmployeeService(ArunEmployeeRepo employeeRepo)
    {
        this.employeeRepo = employeeRepo;
    }
    public boolean saveEmployee(ArunEmployee employee)
    {
        try
        {
            employeeRepo.save(employee);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean updateDetails(int id,ArunEmployee employee)
    {
        if(this.getEmployeeById(id)==null)
        {
            return false;
        }
        try{
            employeeRepo.save(employee);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean deleteEmployee(int id)
    {
        if(this.getEmployeeById(id) == null)
        {
            return false;
        }
        employeeRepo.deleteById(id);
        return true;
    }
    public ArunEmployee getEmployeeById(int id)
    {
        return employeeRepo.findById(id).orElse(null);
    }
}
