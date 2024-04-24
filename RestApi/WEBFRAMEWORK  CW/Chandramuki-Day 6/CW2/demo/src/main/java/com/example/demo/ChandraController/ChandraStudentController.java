package com.example.demo.ChandraController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ChandraModel.ChandraStudent;
import com.example.demo.ChandraService.ChandraStudentService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class ChandraStudentController {

     @Autowired
     public ChandraStudentService studentService;

     @GetMapping("/api/student")
     public ResponseEntity<List<ChandraStudent>> getDetails() {
          List<ChandraStudent> list = studentService.getAll();
          if (list.isEmpty()) {
               return new ResponseEntity<List<ChandraStudent>>(list, HttpStatus.NOT_FOUND);
          }
          return new ResponseEntity<List<ChandraStudent>>(list, HttpStatus.OK);

     }

     @PostMapping("/api/student")
     public ResponseEntity<ChandraStudent> postMethodName(@RequestBody ChandraStudent student) {

          ChandraStudent postData = studentService.post(student);
          return new ResponseEntity<>(postData, HttpStatus.OK);
     }

     @GetMapping("/api/student/sort/{field}")
     public ResponseEntity<List<ChandraStudent>> sortedDetails(@PathVariable String field) {
          List<ChandraStudent> list = studentService.sortedDetails(field);
          if (list.isEmpty()) {
               return new ResponseEntity<List<ChandraStudent>>(list, HttpStatus.NOT_FOUND);
          }
          return new ResponseEntity<List<ChandraStudent>>(list, HttpStatus.OK);

     }
}

