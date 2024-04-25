package com.example.demo.ChandraService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ChandraModel.ChandraDoor;
import com.example.demo.Chandrarepository.ChandraDoorRepo;

@Service
public class ChandraDoorService {
    @Autowired
    private ChandraDoorRepo doorRepo;

    public ChandraDoor postData(ChandraDoor door) {
        return doorRepo.save(door);
    }

    public List<ChandraDoor> getBycolor(String color) {
        return doorRepo.findByColor(color);
    }

    public ChandraDoor updateDetail(int doorid, ChandraDoor door) {
        return doorRepo.save(door);
    }

    public boolean deleteDoor(int doorid) {
        doorRepo.deleteById(doorid);
        return true;
    }

    public List<ChandraDoor> getByDoorType(String doortype) {
        return doorRepo.findByDoorType(doortype);
    }

    public List<ChandraDoor> getAllDetails() {

        return doorRepo.findAll();
    }

    public ChandraDoor getDetailsById(int doorid) {
        return doorRepo.findById(doorid).orElse(null);
    }

}
