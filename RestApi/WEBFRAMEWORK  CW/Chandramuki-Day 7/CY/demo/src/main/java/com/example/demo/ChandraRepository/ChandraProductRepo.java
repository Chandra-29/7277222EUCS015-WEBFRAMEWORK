package com.example.demo.ChandraRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.ChandraModel.ChandraProduct;


@Repository
public interface ChandraProductRepo extends JpaRepository<ChandraProduct, Integer> {

    public List<ChandraProduct> findByProductCategory(String productCategory);
    public List<ChandraProduct> findByPriceCategory(String priceCategory);

}
