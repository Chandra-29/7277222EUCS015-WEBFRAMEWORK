package com.example.demo.ChandramukiService;

import org.springframework.stereotype.Service;

import com.example.demo.ChandramukiModel.ChandramukiProduct;
import com.example.demo.ChandramukiRepository.ChandramukiProductRepo;

@Service
public class ChandramukiProductService {
    public ChandramukiProductRepo productRepo;
    public ChandramukiProductService(ChandramukiProductRepo productRepo)
    {
        this.productRepo = productRepo;
    }
    public boolean saveProduct(ChandramukiProduct product)
    {
        try
        {
            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean updateDetails(int id,ChandramukiProduct product)
    {
        if(this.getProductById(id)==null)
        {
            return false;
        }
        try{
            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean deleteProduct(int id)
    {
        if(this.getProductById(id) == null)
        {
            return false;
        }
        productRepo.deleteById(id);
        return true;
    }
    public ChandramukiProduct getProductById(int id)
    {
        return productRepo.findById(id).orElse(null);
    }
}
