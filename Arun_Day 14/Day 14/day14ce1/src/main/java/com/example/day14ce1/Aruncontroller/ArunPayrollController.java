package com.example.day14ce1.Aruncontroller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.day14ce1.Arunmodel.ArunPayroll;
import com.example.day14ce1.Arunservice.ArunPayrollService;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class ArunPayrollController {
    @Autowired
    ArunPayrollService PayrollService;

    @PutMapping("/employee/{employeeId}/payroll")
    public ArunPayroll addPayroll(@PathVariable Long employeeId,@RequestBody ArunPayroll payroll) {
        return PayrollService.addPayroll(employeeId,payroll);
    }

    @GetMapping("/employee/{employeeId}/payroll")
    public Optional<ArunPayroll> getMethodName(@PathVariable Long employeeId) {
        return PayrollService.getPayroll(employeeId);
    }
    
    
}
