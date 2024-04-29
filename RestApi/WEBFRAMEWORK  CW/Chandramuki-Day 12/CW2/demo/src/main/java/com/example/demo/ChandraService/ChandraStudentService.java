package com.example.demo.ChandraService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ChandraModel.ChandraStudent;
import com.example.demo.ChandraRepository.ChandraStudentRepository;

@Service
public class ChandraStudentService {
    @Autowired
    ChandraStudentRepository studentRepository;
    public ChandraStudent addStudents(ChandraStudent student)
    {
        return studentRepository.save(student);
    }
    public List<ChandraStudent>getStudent()
    {
        return studentRepository.findAll();
    }
    public List<ChandraStudent>getStudentInner()
    {
        return studentRepository.getStudentInner();
    }
    public List<ChandraStudent>getStudentLeftOuter()
    {
        return studentRepository.getStudentsLeftOuter();
    }
    
}
