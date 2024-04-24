package com.example.demo.ChandraRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.ChandraModel.ChandraCar;


@Repository
public interface ChandraCarRepo extends JpaRepository<ChandraCar,Integer>{

    ChandraCar findDistinctBycurrentOwnerNameAndAddress(String currentOwnerName, String address); 
}
