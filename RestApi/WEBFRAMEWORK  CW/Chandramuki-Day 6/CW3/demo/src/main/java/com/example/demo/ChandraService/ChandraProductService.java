package com.example.demo.ChandraService;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.ChandraModel.ChandraProduct;
import com.example.demo.ChandraRepository.ChandraProductRepo;

@Service
public class ChandraProductService {
    public ChandraProductRepo productRepo;
    public ChandraProductService(ChandraProductRepo productRepo)
    {
        this.productRepo = productRepo;
    }
    public boolean postProduct(ChandraProduct product)
    {
        try{

            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<ChandraProduct> pagination(int offset,int size)
    {
        return productRepo.findAll(PageRequest.of(offset, size)).getContent();
    }
    public List<ChandraProduct> sortPagination(int offset,int size,String field)
    {
        return productRepo.findAll(PageRequest.of(offset, size, Sort.by(field))).getContent();
    }
    public ChandraProduct getProductById(int id)
    {
        return productRepo.findById(id).orElse(null);
    }
}
