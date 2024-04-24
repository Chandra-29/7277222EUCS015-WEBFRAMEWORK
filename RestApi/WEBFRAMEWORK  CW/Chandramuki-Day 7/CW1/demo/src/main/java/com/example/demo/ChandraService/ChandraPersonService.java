package com.example.demo.ChandraService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ChandraModel.ChandraPerson;
import com.example.demo.ChandraRepository.ChandraPersonRepo;


@Service
public class ChandraPersonService {

     @Autowired
     public ChandraPersonRepo personRepo;

     public ChandraPerson SaveEntity(ChandraPerson entity) {
          return personRepo.save(entity);

     }

     public List<ChandraPerson> getDetails() {
          return personRepo.findAll();

     }

     public List<ChandraPerson> findByAge(int byAge) {
          return personRepo.findByAge(byAge);
     }

}

