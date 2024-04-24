package com.example.demo.ChandraService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ChandraModel.ChandraStudent;
import com.example.demo.ChandraRepository.ChandraStudentRepo;

@Service
public class ChandraStudentService {
    @Autowired
    private ChandraStudentRepo studentRepo;

    public boolean post(ChandraStudent student) {
        try {
            studentRepo.save(student);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<ChandraStudent> start(int mark) {
        return studentRepo.findByMarksGreaterThan(mark);
    }

    public List<ChandraStudent> end(int mark) {
        return studentRepo.findByMarksLessThan(mark);
    }

}
