package com.example.demo.ChandraService;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.ChandraModel.ChandraStudent;
import com.example.demo.ChandraRepository.ChandraStudentRepository;

@Service
public class ChandraStudentService {
    public ChandraStudentRepository studentRepository;
    public ChandraStudentService(ChandraStudentRepository studentRepository)
    {
        this.studentRepository = studentRepository;
    }
    public ChandraStudent saveStudent(ChandraStudent student)
    {
        return studentRepository.save(student);
    }
    public List<ChandraStudent> getStudents()
    {
        return studentRepository.findAll();
    }
}

