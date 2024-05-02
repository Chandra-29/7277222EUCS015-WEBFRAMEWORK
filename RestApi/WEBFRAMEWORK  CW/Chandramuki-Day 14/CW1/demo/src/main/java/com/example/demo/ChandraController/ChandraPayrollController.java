package com.example.demo.ChandraController;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.ChandraModel.ChandraPayroll;
import com.example.demo.ChandraService.ChandraPayrollService;

@RestController
@RequestMapping("/employee/{employeeId}/payroll")
public class ChandraPayrollController {
    private final ChandraPayrollService payrollService;

    public ChandraPayrollController(ChandraPayrollService payrollService) {
        this.payrollService = payrollService;
    }

    @PostMapping
    public ResponseEntity<ChandraPayroll> createPayrollForEmployee(@PathVariable Long employeeId, @RequestBody ChandraPayroll payroll) {
        ChandraPayroll createdPayroll = payrollService.createPayroll(payroll);
        if (createdPayroll != null) {
            return ResponseEntity.status(HttpStatus.CREATED).body(createdPayroll);
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    @GetMapping
    public ResponseEntity<ChandraPayroll> getPayrollForEmployee(@PathVariable Long employeeId) {
        ChandraPayroll payroll = payrollService.getPayrollByEmployeeId(employeeId);
        if (payroll != null) {
            return ResponseEntity.ok(payroll);
        } else {
            return ResponseEntity.status(404).build();
        }
    }
}
