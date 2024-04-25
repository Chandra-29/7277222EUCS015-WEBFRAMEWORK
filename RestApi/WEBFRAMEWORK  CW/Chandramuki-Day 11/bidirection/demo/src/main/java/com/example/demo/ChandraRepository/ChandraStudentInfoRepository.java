package com.example.demo.ChandraRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.ChandraModel.ChandraStudentInfo;

@Repository
public interface ChandraStudentInfoRepository extends JpaRepository<ChandraStudentInfo,Integer>{
    
}
