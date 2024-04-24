package com.example.demo.ChandramukiService;




import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ChandramukiModel.ChandramukiJob;
import com.example.demo.ChandramukiRepository.ChandramukiJobRepo;






@Service
public class ChandramukiJobService {

     @Autowired
     public ChandramukiJobRepo jobRepo;

     public List<ChandramukiJob> getList() {
          return jobRepo.findAll();
     }

     public ChandramukiJob postJob(ChandramukiJob job) {
          return jobRepo.save(job);
     }

     public Optional<ChandramukiJob> getId(int jobId) {
          return jobRepo.findById(jobId);
     }

}