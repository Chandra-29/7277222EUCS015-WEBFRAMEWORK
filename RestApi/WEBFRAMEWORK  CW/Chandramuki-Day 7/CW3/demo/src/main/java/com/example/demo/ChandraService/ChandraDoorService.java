package com.example.demo.ChandraService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ChandraModel.ChandraDoor;
import com.example.demo.ChandraRepository.ChandraDoorRepo;

@Service
public class ChandraDoorService {
    @Autowired
    private ChandraDoorRepo rep;

    public boolean post(ChandraDoor door)
    {
        try
        {
            rep.save(door);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public List<ChandraDoor> getAll()
    {
        return rep.findAll();
    }

    public List<ChandraDoor> getbyDoorId(int doorId)
    {
        return rep.findByDoorId(doorId);
    }
    public List<ChandraDoor> getbyType(String type)
    {
        return rep.findByAccessType(type);
    }
    
}
