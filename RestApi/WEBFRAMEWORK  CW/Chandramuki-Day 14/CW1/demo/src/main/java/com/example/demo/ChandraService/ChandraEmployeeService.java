package com.example.demo.ChandraService;

import org.springframework.stereotype.Service;

import com.example.demo.ChandraModel.ChandraEmployee;
import com.example.demo.ChandraRepository.ChandraEmployeeRepo;

import java.util.List;
import java.util.Optional;

@Service
public class ChandraEmployeeService {
    private final ChandraEmployeeRepo employeeRepo;

    public ChandraEmployeeService(ChandraEmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public ChandraEmployee createEmployee(ChandraEmployee employee) {
        return employeeRepo.save(employee);
    }

    public List<ChandraEmployee> getAllEmployees() {
        return employeeRepo.findAll();
    }

    public Optional<ChandraEmployee> getEmployeeById(Long id) {
        return employeeRepo.findById(id);
    }
}
