package com.example.demo.ChandramukiRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.ChandramukiModel.ChandramukiChildren;

public interface ChandramukiChildrenRepo extends JpaRepository<ChandramukiChildren, Integer> {

}