package com.example.ce1.Aruncontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ce1.Arunmodel.ArunEmployee;
import com.example.ce1.Arunservice.ArunEmployeeService;

@RestController
public class ArunEmployeeController {
    @Autowired
    ArunEmployeeService employeeService;

    @PostMapping("/employee")
    public ArunEmployee setMethod(@RequestBody ArunEmployee employee)
    {
        return employeeService.setEmployee(employee);
    }

    @GetMapping("/employees-inner-join")
    public List<ArunEmployee> getInnerMethod()
    {
        return employeeService.getInnerEmployee();
    }

    @GetMapping("/employees-left-outer-join")
    public List<ArunEmployee> getLeftMethod()
    {
        return employeeService.getLeftOuterEmployee();
    }
}
