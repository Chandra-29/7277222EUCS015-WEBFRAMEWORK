package com.example.demo.ChandraController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ChandraModel.ChandraEmployee;
import com.example.demo.ChandraService.ChandraEmployeeService;

@RestController
public class ChandraEmployeeController {
    @Autowired
    ChandraEmployeeService employeeService;

    @PostMapping("/employee")
    public ChandraEmployee setMethod(@RequestBody ChandraEmployee employee)
    {
        return employeeService.setEmployee(employee);
    }

    @GetMapping("/employees-inner-join")
    public List<ChandraEmployee> getInnerMethod()
    {
        return employeeService.getInnerEmployee();
    }

    @GetMapping("/employees-left-outer-join")
    public List<ChandraEmployee> getLeftMethod()
    {
        return employeeService.getLeftOuterEmployee();
    }
}
