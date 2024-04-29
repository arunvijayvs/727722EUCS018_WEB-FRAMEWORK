package com.example.day14ce1.Arunservice;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day14ce1.Arunmodel.ArunPayroll;
import com.example.day14ce1.Arunrepository.ArunPayrollRepo;

@Service
public class ArunPayrollService {
    @Autowired
    ArunPayrollRepo payrollRepo;

    public ArunPayroll addPayroll(Long id,ArunPayroll payroll)
    {
        ArunPayroll avail = payrollRepo.findById(id).orElse(null);

        if(avail!=null){
            avail.setAmount(payroll.getAmount());
            avail.setNoOfDaysWorked(payroll.getNoOfDaysWorked());
        return payrollRepo.save(avail);
        }
        else 
        return null;
    }

    public Optional<ArunPayroll> getPayroll(Long employeeId)
    {
        return payrollRepo.findById(employeeId);
    }
}
