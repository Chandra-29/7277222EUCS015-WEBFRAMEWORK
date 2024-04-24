package com.example.demo.ChandraService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ChandraModel.ChandraRecipe;
import com.example.demo.ChandraRepository.ChandraRecipeRepo;

@Service
public class ChandraRecipeService {
    @Autowired
    private ChandraRecipeRepo rep;

  
    @SuppressWarnings("null")
    public boolean post(ChandraRecipe recipe)
    {
        try
        {
            rep.save(recipe);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public ChandraRecipe getByid(int id)
    {
        return rep.findById(id).orElse(null);
    }

    public List<ChandraRecipe> filter(String name)
    {
        return rep.findByProduct(name);
    }
    
    
}
