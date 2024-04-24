package com.example.demo.ChandraRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.ChandraModel.ChandraProduct;

import java.util.List;


@Repository
public interface ChandraProductRepo extends JpaRepository<ChandraProduct,Integer>{

    List<ChandraProduct> findByProductNameStartingWith(String name);
    List<ChandraProduct> findByProductNameEndingWith(String name);
    
}
