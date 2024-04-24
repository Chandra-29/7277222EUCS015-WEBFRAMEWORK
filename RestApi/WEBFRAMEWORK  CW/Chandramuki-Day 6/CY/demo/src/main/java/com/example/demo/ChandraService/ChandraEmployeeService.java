package com.example.demo.ChandraService;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.ChandraModel.ChandraEmployee;
import com.example.demo.ChandraRepository.ChandraEmployeeRepo;
@Service
public class ChandraEmployeeService {
    public ChandraEmployeeRepo employeeRepo;
    public ChandraEmployeeService(ChandraEmployeeRepo employeeRepo)
    {
        this.employeeRepo = employeeRepo;
    }
    public boolean postEmployee(ChandraEmployee employee)
    {
        try{

            employeeRepo.save(employee);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<ChandraEmployee> sortEmployee(String field)
    {
        return employeeRepo.findAll(Sort.by(field));
    }
    public List<ChandraEmployee> paginationEmployee(int pageno,int size)
    {
        return employeeRepo.findAll(PageRequest.of(pageno, size)).getContent();
    }
    public List<ChandraEmployee>  sortPaginationEmployee(int pageno,int size,String field)
    {
        return employeeRepo.findAll(PageRequest.of(pageno, size,Sort.by(field))).getContent();
    }
}

