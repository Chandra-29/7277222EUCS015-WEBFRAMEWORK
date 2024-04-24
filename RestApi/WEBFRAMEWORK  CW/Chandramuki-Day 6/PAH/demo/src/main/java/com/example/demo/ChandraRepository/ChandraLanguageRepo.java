package com.example.demo.ChandraRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.ChandraModel.ChandraLanguage;

@Repository
public interface ChandraLanguageRepo extends JpaRepository<ChandraLanguage,Integer>{
    
}
