package com.example.demo.ChandraService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ChandraModel.ChandraStudentDetail;
import com.example.demo.ChandraRepository.ChandraStudentDetailRepository;
import com.example.demo.ChandraRepository.ChandraStudentRepository;

@Service
public class ChandraStudentDetailService {
    @Autowired
    ChandraStudentDetailRepository studentDetailRepository;
    @Autowired
    ChandraStudentRepository studentRepository;
    public ChandraStudentDetail addStudentDetail(int id,ChandraStudentDetail studentDetail)
    {
        if(studentRepository.existsById(id))
        {
            studentDetailRepository.addStudentDetail(studentDetail.getAddress(),studentDetail.getPhoneNumber(),id);
            return studentDetail;
        }
        else
        return null;
    }
    
    
}
