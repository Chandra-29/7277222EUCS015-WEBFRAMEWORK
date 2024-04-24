package com.example.demo.ChandramukiService;

import org.springframework.stereotype.Service;

import com.example.demo.ChandramukiModel.ChandramukiEmployee;
import com.example.demo.ChandramukiRepository.ChandramukiEmployeeRepo;

@Service
public class ChandramukiEmployeeService {
    public ChandramukiEmployeeRepo employeeRepo;
    public ChandramukiEmployeeService(ChandramukiEmployeeRepo employeeRepo)
    {
        this.employeeRepo = employeeRepo;
    }
    public boolean saveEmployee(ChandramukiEmployee employee)
    {
        try
        {
            employeeRepo.save(employee);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean updateDetails(int id,ChandramukiEmployee employee)
    {
        if(this.getEmployeeById(id)==null)
        {
            return false;
        }
        try{
            employeeRepo.save(employee);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean deleteEmployee(int id)
    {
        if(this.getEmployeeById(id) == null)
        {
            return false;
        }
        employeeRepo.deleteById(id);
        return true;
    }
    public ChandramukiEmployee getEmployeeById(int id)
    {
        return employeeRepo.findById(id).orElse(null);
    }
}
