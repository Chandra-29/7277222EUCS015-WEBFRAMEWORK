package com.example.demo.ChandraService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.ChandraModel.ChandraStudent;
import com.example.demo.ChandraRepository.ChandraStudentRepo;

@Service
public class ChandraStudentService {

     @Autowired
     public ChandraStudentRepo studentRepo;

     public List<ChandraStudent> getAll() {
          return studentRepo.findAll();
     }

     public ChandraStudent post(ChandraStudent student) {
          return studentRepo.save(student);
     }

     public List<ChandraStudent> sortedDetails(String field) {
          return studentRepo.findAll(Sort.by(Sort.Direction.DESC, field));
     }
}
