package com.example.demo.ChandraRepository;
import com.example.demo.ChandraModel.ChandraEmployee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChandraEmployeeRepository extends JpaRepository<ChandraEmployee, Integer> {
}