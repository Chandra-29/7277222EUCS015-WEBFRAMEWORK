package com.example.demo.ChandramukiRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.ChandramukiModel.ChandramukiLanguage;

public interface ChandramukiLanguageRepo extends JpaRepository<ChandramukiLanguage,Integer>{
    
}
