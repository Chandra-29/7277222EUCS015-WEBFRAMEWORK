package com.example.demo.ChandramukiRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.ChandramukiModel.ChandramukiEmployee;

@Repository
public interface ChandramukiEmployeeRepo extends JpaRepository<ChandramukiEmployee,Integer>{
    
}

