package com.example.demo.ChandraService;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.ChandraModel.ChandraStudent;
import com.example.demo.ChandraModel.ChandraStudentInfo;
import com.example.demo.ChandraRepository.ChandraStudentInfoRepository;
import com.example.demo.ChandraRepository.ChandraStudentRepository;

@Service
public class ChandraStudentService {
    public ChandraStudentRepository studentRepository;
    public ChandraStudentInfoRepository studentInfoRepository;
    public ChandraStudentService(ChandraStudentRepository studentRepository,ChandraStudentInfoRepository studentInfoRepository)
    {
        this.studentRepository = studentRepository;
        this.studentInfoRepository = studentInfoRepository;
    }
    public ChandraStudent saveStudent(ChandraStudent student)
    {
        return studentRepository.save(student);
    }
    public ChandraStudentInfo saveStudentInfo(ChandraStudentInfo studentInfo)
    {
        return studentInfoRepository.save(studentInfo);
    }
    public List<ChandraStudent> getStudents()
    {
        return studentRepository.findAll();
    }
}
