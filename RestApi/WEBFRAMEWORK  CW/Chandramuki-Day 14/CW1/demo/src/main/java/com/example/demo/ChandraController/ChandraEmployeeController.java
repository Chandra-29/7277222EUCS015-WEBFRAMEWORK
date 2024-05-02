package com.example.demo.ChandraController;

import com.example.demo.ChandraModel.ChandraEmployee;
import com.example.demo.ChandraService.ChandraEmployeeService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class ChandraEmployeeController {
    private final ChandraEmployeeService employeeService;

    public ChandraEmployeeController(ChandraEmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping
    public ResponseEntity<ChandraEmployee> createEmployee(@RequestBody ChandraEmployee employee) {
        ChandraEmployee createdEmployee = employeeService.createEmployee(employee);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdEmployee);
    }

    @GetMapping
    public ResponseEntity<List<ChandraEmployee>> getAllEmployees() {
        List<ChandraEmployee> employees = employeeService.getAllEmployees();
        return ResponseEntity.ok(employees);
    }

    @GetMapping("/{employeeId}")
    public ResponseEntity<ChandraEmployee> getEmployeeById(@PathVariable Long employeeId) {
        Optional<ChandraEmployee> employee = employeeService.getEmployeeById(employeeId);
        return employee.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}


