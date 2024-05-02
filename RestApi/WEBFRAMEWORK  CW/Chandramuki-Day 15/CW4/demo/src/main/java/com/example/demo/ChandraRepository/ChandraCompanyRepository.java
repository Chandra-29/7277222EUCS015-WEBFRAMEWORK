package com.example.demo.ChandraRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.ChandraModel.ChandraCompany;

@Repository
public interface ChandraCompanyRepository extends JpaRepository<ChandraCompany, Integer> {
}