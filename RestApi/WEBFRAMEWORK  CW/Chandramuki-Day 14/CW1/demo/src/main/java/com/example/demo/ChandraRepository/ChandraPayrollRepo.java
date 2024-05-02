package com.example.demo.ChandraRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.ChandraModel.ChandraPayroll;

public interface ChandraPayrollRepo extends JpaRepository<ChandraPayroll,Long>{
    
}