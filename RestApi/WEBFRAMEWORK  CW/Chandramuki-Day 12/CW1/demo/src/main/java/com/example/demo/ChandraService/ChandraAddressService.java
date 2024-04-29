package com.example.demo.ChandraService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ChandraModel.ChandraAddress;
import com.example.demo.ChandraRepository.ChandraAddressRepo;
import com.example.demo.ChandraRepository.ChandraEmployeeRepo;

@Service
public class ChandraAddressService {
    @Autowired
    ChandraAddressRepo addressRepo;
    @Autowired
    ChandraEmployeeRepo employeeRepo;
    public ChandraAddress setAddressById(int id,ChandraAddress address)
    {
        if(employeeRepo.existsById(id))
        {
            addressRepo.setByemployeeId(address.getCity(), address.getStreet(), id);
            return address;
        }
        else
        {
            return null;
        }
    }
}
