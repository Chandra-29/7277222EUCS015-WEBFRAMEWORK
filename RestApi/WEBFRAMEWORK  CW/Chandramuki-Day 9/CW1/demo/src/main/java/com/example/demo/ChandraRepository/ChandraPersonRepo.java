package com.example.demo.ChandraRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.ChandraModel.ChandraPerson;

public interface ChandraPersonRepo extends JpaRepository<ChandraPerson, Integer> {
    @Query("SELECT p FROM Person p WHERE age=?1")
    List<ChandraPerson> findByAge(int age);
}
