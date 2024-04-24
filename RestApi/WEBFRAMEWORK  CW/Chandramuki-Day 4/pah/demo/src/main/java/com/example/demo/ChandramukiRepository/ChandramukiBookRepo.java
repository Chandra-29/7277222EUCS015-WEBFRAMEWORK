package com.example.demo.ChandramukiRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.ChandramukiModel.ChandramukiBook;


@Repository

public interface ChandramukiBookRepo extends JpaRepository<ChandramukiBook,Integer> {

}