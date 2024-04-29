package com.example.demo.ChandraService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ChandraModel.ChandraEmployee;
import com.example.demo.ChandraRepository.ChandraEmployeeRepo;

@Service
public class ChandraEmployeeService {
    @Autowired
    ChandraEmployeeRepo employeeRepo;

    @SuppressWarnings("null")
    public ChandraEmployee setEmployee(ChandraEmployee employee)
    {
        return employeeRepo.save(employee);
    }

    public List<ChandraEmployee> getInnerEmployee()
    {
        return employeeRepo.getByInnerEmployees();
    }

    public List<ChandraEmployee> getLeftOuterEmployee()
    {
        return employeeRepo.getByLeftOuterEmployees();
    }
}
