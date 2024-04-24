package com.example.demo.ChandraRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.ChandraModel.ChandraPerson;

import java.util.List;


@Repository
public interface ChandraPersonRepo extends JpaRepository<ChandraPerson,Integer>{

    List<ChandraPerson> findByLastnameNot(String lastname);
    List<ChandraPerson> findByAgeNotIn(List<Integer> ages);
    
}

