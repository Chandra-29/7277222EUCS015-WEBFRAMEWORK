package com.example.demo.ChandraController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ChandraModel.ChandraCourse;
import com.example.demo.ChandraService.ChandraCourseService;

@RestController
public class ChandraCourseController {

     @Autowired
     public ChandraCourseService CourseService;

     @PostMapping("/api/course")
     public ResponseEntity<ChandraCourse> postMethodName(@RequestBody ChandraCourse entity) {

          ChandraCourse inst = CourseService.SaveEntity(entity);

          return new ResponseEntity<ChandraCourse>(inst, HttpStatus.CREATED);

     }

     @GetMapping("/api/course")
     public ResponseEntity<List<ChandraCourse>> getMethodName() {

          List<ChandraCourse> show = CourseService.getDetails();
          if (!show.isEmpty()) {
               return new ResponseEntity<List<ChandraCourse>>(show, HttpStatus.OK);
          } else {
               return new ResponseEntity<List<ChandraCourse>>(show, HttpStatus.NOT_FOUND);
          }
     }

     @GetMapping("api/course/{courseName}")
     public List<ChandraCourse> custom(@PathVariable String courseName) {
          return CourseService.findByCourseName(courseName);

     }
}