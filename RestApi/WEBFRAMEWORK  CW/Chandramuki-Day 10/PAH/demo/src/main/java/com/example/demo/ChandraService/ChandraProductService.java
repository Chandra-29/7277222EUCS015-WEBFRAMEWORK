package com.example.demo.ChandraService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ChandraModel.ChandraProduct;
import com.example.demo.ChandraRepository.ChandraProductRepo;

@Service
public class ChandraProductService {
    @Autowired
    private ChandraProductRepo productRepo;

    public boolean saveProduct(ChandraProduct product)
    {
        try
        {
            productRepo.save(product);
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
    }
    
    public List<ChandraProduct> findByCategoryList(String category)
    {
        return productRepo.findByCategoryList(category);
    }

    public ChandraProduct updateProduct(int productId, int quantityInStock)
    {
        productRepo.updateQuantity(productId, quantityInStock);
        return productRepo.findById(productId).orElse(null);
    }

    public ChandraProduct deleteProduct(int productId)
    {
        productRepo.deleteProduct(productId);
        return productRepo.findById(productId).orElse(null);
    }
}