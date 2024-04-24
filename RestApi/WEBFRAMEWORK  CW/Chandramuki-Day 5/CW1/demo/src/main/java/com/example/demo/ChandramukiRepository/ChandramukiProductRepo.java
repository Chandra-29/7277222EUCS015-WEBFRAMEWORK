package com.example.demo.ChandramukiRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.ChandramukiModel.ChandramukiProduct;

@Repository
public interface ChandramukiProductRepo extends JpaRepository<ChandramukiProduct,Integer>{
    
}
