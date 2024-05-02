package com.example.demo.ChandraRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.ChandraModel.ChandraPlayer;

public interface ChandraPlayerRepo extends JpaRepository<ChandraPlayer, Integer>{
    
}
