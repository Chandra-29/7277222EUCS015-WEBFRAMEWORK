package com.example.demo.ChandraService;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.ChandraModel.ChandraPerson;
import com.example.demo.ChandraRepository.ChandraPersonRepo;

@Service
public class ChandraPersonService {
    public ChandraPersonRepo personRepo;

    public ChandraPersonService(ChandraPersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    public boolean savePerson(ChandraPerson person) {
        try {
            personRepo.save(person);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public List<ChandraPerson> getPersonByAge(int age) {
        return personRepo.findByAge(age);
    }
}
