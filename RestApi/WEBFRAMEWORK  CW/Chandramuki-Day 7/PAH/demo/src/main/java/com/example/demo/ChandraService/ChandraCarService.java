package com.example.demo.ChandraService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.stereotype.Service;

import com.example.demo.ChandraModel.ChandraCar;
import com.example.demo.ChandraRepository.ChandraCarRepo;

@Service
public class ChandraCarService {
    @Autowired
    private ChandraCarRepo carRepo;

    public boolean post(ChandraCar car)
    {
        try
        {
            carRepo.save(car);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public List<ChandraCar> getAll()
    {
        return carRepo.findAll();
    }

    public ChandraCar getByDetails(String currentOwnerName, String address)
    {
        try{
        return carRepo.findDistinctBycurrentOwnerNameAndAddress(currentOwnerName, address);
        }
        catch(IncorrectResultSizeDataAccessException i)
        {
            System.out.println("\n\n"+i+"\n\nUse List if needed");
            return null;
        }
        catch(Exception e)
        {
            System.out.println("\n\n"+e);
            return null;
        }
    }
    
}
