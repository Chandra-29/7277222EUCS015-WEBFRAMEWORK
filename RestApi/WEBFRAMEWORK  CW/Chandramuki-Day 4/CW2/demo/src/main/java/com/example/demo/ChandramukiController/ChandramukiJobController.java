package com.example.demo.ChandramukiController;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ChandramukiModel.ChandramukiJob;
import com.example.demo.ChandramukiService.ChandramukiJobService;

@RestController

public class ChandramukiJobController {

     @Autowired
     public ChandramukiJobService jobService;

     @GetMapping("/api/job")
     public ResponseEntity<List<ChandramukiJob>> displayDetails() {
          List<ChandramukiJob> list = jobService.getList();
          if (list.isEmpty()) {
               return new ResponseEntity<>(HttpStatus.NOT_FOUND);
          } else {

               return new ResponseEntity<>(list, HttpStatus.OK);
          }

     }

     @PostMapping("/api/job")
     public ChandramukiJob postMethodName(@RequestBody ChandramukiJob job) {
          return jobService.postJob(job);
     }

     @GetMapping("/api/job/{jobId}")
     public ResponseEntity<Optional<ChandramukiJob>> getMethodName(@PathVariable int jobId) {

          Optional<ChandramukiJob> Id = jobService.getId(jobId);
          if (Id.isPresent()) {
               return new ResponseEntity<>(Id, HttpStatus.OK);
          }
          return new ResponseEntity<Optional<ChandramukiJob>>(Id, HttpStatus.NOT_FOUND);

     }

}
