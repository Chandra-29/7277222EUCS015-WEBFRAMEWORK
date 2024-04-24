package com.example.demo.ChandraService;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.demo.ChandraModel.ChandraCourse;
import com.example.demo.ChandraRepository.ChandraCourseRepo;

@Service
public class ChandraCourseService {

     @Autowired
     public ChandraCourseRepo courseRepo;

     public ChandraCourse SaveEntity(ChandraCourse entity) {
          return courseRepo.save(entity);

     }

     public List<ChandraCourse> getDetails() {
          return courseRepo.findAll();

     }

     public List<ChandraCourse> findByCourseName(String courseName) {
          return courseRepo.findByCourseName(courseName);
     }

}
