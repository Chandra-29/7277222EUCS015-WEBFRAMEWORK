package com.example.demo.ChandraService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.demo.ChandraModel.ChandraProduct;
import com.example.demo.ChandraRepository.ChandraProductRepo;

@Service
public class ChandraProductService {
    @Autowired
    ChandraProductRepo repo;

    @SuppressWarnings("null")
    public boolean post(ChandraProduct c) {
        try {

            repo.save(c);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<ChandraProduct> getAll() {
        return repo.findAll();

    }

    public List<ChandraProduct> getProduct(String age) {
        return repo.findByProductCategory(age);

    }
    public List<ChandraProduct> getProductbyprice(String age) {
        return repo.findByPriceCategory(age);

    }

}
