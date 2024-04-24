package com.example.demo.ChandraController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ChandraModel.ChandraProduct;
import com.example.demo.ChandraService.ChandraProductService;

@RestController
public class ChandraProductController {
    @Autowired
    ChandraProductService service;

    @PostMapping("/api/Product")
    public ResponseEntity<ChandraProduct> postMethod(@RequestBody ChandraProduct s) {
        if (service.post(s)) {
            return new ResponseEntity<ChandraProduct>(s, HttpStatus.CREATED);
        } else {

            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/api/product")
    public ResponseEntity<List<ChandraProduct>> dndcjk() {
        List<ChandraProduct> page = service.getAll();
        if (!page.isEmpty()) {
            return new ResponseEntity<List<ChandraProduct>>(page, HttpStatus.OK);

        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }
    }

    @GetMapping("/api/product/category/{productCategory}")
    public ResponseEntity<List<ChandraProduct>> getbyid(@PathVariable String productCategory) {
        List<ChandraProduct> p = service.getProduct(productCategory);
        if (!p.isEmpty()) {
            return new ResponseEntity<List<ChandraProduct>>(p, HttpStatus.OK);

        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }

    }

    @GetMapping("/api/product/category/priceCategory/{priceCategory}")
    public ResponseEntity<List<ChandraProduct>> getbdyid(@PathVariable String priceCategory) {
        List<ChandraProduct> p = service.getProductbyprice(priceCategory);
        if (!p.isEmpty()) {
            return new ResponseEntity<List<ChandraProduct>>(p, HttpStatus.OK);

        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }

    }

}
