package com.example.demo.ChandramukiRepository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.ChandramukiModel.ChandramukiJob;


@Repository
public interface ChandramukiJobRepo extends JpaRepository<ChandramukiJob, Integer> {

}