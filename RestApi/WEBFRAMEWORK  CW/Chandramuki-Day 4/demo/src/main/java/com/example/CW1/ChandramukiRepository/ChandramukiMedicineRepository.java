package com.example.CW1.ChandramukiRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.CW1.ChandramukiModel.ChandramukiMedicine;

@Repository
public interface ChandramukiMedicineRepository extends JpaRepository<ChandramukiMedicine, Integer> {
}
