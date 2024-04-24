package com.example.demo.ChandraRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.ChandraModel.ChandraPerson;

@Repository
public interface ChandraPersonRepo extends JpaRepository<ChandraPerson, Integer> {

     List<ChandraPerson> findByAge(int byAge);
}