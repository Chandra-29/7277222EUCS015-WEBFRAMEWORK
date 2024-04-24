package com.example.demo.ChandraService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ChandraModel.ChandraPerson;
import com.example.demo.ChandraRepository.ChandraPersonRepo;

@Service
public class ChandraPersonService {
    @Autowired
    private ChandraPersonRepo rep;

    public boolean post(ChandraPerson person)
    {
        try
        {
            rep.save(person);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public List<ChandraPerson> start(String lastname)
    {
        return rep.findByLastnameNot(lastname);
    }

    public List<ChandraPerson> end(List<Integer> ages)
    {
        return rep.findByAgeNotIn(ages);
    }
    
}
