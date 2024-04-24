package com.example.demo.ChandraRepository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.ChandraModel.ChandraCourse;


@Repository
public interface ChandraCourseRepo extends JpaRepository<ChandraCourse, Integer> {

     List<ChandraCourse> findByCourseName(String courseName);

}