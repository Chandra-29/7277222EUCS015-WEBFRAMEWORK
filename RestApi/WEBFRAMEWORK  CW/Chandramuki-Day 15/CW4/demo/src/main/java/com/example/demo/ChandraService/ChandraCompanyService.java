package com.example.demo.ChandraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ChandraModel.ChandraCompany;
import com.example.demo.ChandraRepository.ChandraCompanyRepository;

import java.util.List;

@Service
public class ChandraCompanyService {

    @Autowired
    private ChandraCompanyRepository companyRepository;

    public List<ChandraCompany> getAllCompanies() {
        return companyRepository.findAll();
    }

    public ChandraCompany getCompanyById(int id) {
        return companyRepository.findById(id).orElse(null);
    }

    public ChandraCompany addCompany(ChandraCompany company) {
        return companyRepository.save(company);
    }
}