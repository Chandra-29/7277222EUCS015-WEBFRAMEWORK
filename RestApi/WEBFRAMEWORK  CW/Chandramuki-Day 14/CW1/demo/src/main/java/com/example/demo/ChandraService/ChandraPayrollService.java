package com.example.demo.ChandraService;

import org.springframework.stereotype.Service;

import com.example.demo.ChandraModel.ChandraPayroll;
import com.example.demo.ChandraRepository.ChandraPayrollRepo;

@Service
public class ChandraPayrollService {
    private final ChandraPayrollRepo payrollRepo;

    public ChandraPayrollService(ChandraPayrollRepo payrollRepo) {
        this.payrollRepo = payrollRepo;
    }

    public ChandraPayroll createPayroll(ChandraPayroll payroll) {
        return payrollRepo.save(payroll);
    }

    public ChandraPayroll getPayrollByEmployeeId(Long employeeId) {
        return payrollRepo.findById(employeeId).orElse(null);
    }
}
