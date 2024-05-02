package com.example.demo.ChandraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ChandraModel.ChandraEmployee;
import com.example.demo.ChandraRepository.ChandraEmployeeRepository;

import java.util.List;

@Service
public class ChandraEmployeeService {

    @Autowired
    private ChandraEmployeeRepository employeeRepository;

    public List<ChandraEmployee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public ChandraEmployee getEmployeeById(int id) {
        return employeeRepository.findById(id).orElse(null);
    }

    public ChandraEmployee addEmployee(ChandraEmployee employee) {
        return employeeRepository.save(employee);
    }
}
