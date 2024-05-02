package com.example.demo;

import java.util.List;

import com.example.cw3.repository.ChandraProductRepo;
import com.example.demo.ChandraModel.ChandraProduct;

@Service
public class ChandraProductService {

    @Autowired
    private ChandraProductRepo productRepo;

    public List<ChandraProduct> getAllProducts() {
        return productRepo.findAll();
    }

    public ChandraProduct getProductById(int id) {
        return productRepo.findById(id).orElse(null);
    }

    public ChandraProduct addProduct(ChandraProduct product) {
        return productRepo.save(product);
    }
}