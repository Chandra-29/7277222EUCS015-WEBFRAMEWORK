package com.example.demo.ChandraRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.ChandraModel.ChandraStudent;

@Repository
public interface ChandraStudentRepo extends JpaRepository<ChandraStudent, Integer> {

}