package com.example.demo.ChandraRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.ChandraModel.ChandraStudent;

import java.util.List;

@Repository
public interface ChandraStudentRepo extends JpaRepository<ChandraStudent, Long> {

    List<ChandraStudent> findByMarksGreaterThan(int mark);

    List<ChandraStudent> findByMarksLessThan(int mark);

}
