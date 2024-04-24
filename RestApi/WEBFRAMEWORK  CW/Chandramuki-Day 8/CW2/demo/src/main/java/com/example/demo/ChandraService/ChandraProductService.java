package com.example.demo.ChandraService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.ChandraModel.ChandraProduct;
import com.example.demo.ChandraRepository.ChandraProductRepo;

@Service
public class ChandraProductService {
    @Autowired
    private ChandraProductRepo rep;

    @SuppressWarnings("null")
    public boolean post(ChandraProduct person)
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

    public List<ChandraProduct> start(String value)
    {
        return rep.findByProductNameStartingWith(value);
    }

    public List<ChandraProduct> end(String value)
    {
        return rep.findByProductNameEndingWith(value);
    }
    public List<ChandraProduct> sort()
    {
        return rep.findAll(Sort.by("price"));
    }
    
}

