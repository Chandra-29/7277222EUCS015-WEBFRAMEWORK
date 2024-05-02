package com.example.demo.ChandraRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.ChandraModel.ChandraEmployee;

public interface ChandraEmployeeRepo extends JpaRepository<ChandraEmployee, Long> {
}
