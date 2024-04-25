package com.example.demo.ChandraController;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ChandraModel.ChandraStudent;
import com.example.demo.ChandraModel.ChandraStudentInfo;
import com.example.demo.ChandraService.ChandraStudentService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class ChandraStudentController {
    public ChandraStudentService studentService;
    public ChandraStudentController(ChandraStudentService studentService)
    {
        this.studentService = studentService;
    }
    @PostMapping("/api/poststudent")
    public ChandraStudent postMethodName(@RequestBody ChandraStudent student) {
        return studentService.saveStudent(student);
    }
    @PostMapping("/api/poststudentinfo")
    public ChandraStudentInfo postMethodName(@RequestBody ChandraStudentInfo studentInfo) {
        return studentService.saveStudentInfo(studentInfo);
    }
    @GetMapping("/api/student")
    public List<ChandraStudent> getMethodName() {
        return studentService.getStudents();
    }
    
}