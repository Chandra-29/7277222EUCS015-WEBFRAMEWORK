package com.example.demo.ChandraService;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ChandraModel.ChandraPerson;
import com.example.demo.ChandraRepository.ChandraPersonRepo;

@Service
public class ChandraPersonService {
    @Autowired
    private ChandraPersonRepo repo;

    public ChandraPerson createPerson(ChandraPerson person) {
        return repo.save(person);
    }

    public List<ChandraPerson> getAllPersons() {
        return repo.findAll();
    }
}
