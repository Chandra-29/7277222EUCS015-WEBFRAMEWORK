package com.example.CW1.ChandramukiService;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CW1.ChandramukiModel.ChandramukiMedicine;
import com.example.CW1.ChandramukiRepository.ChandramukiMedicineRepository;

@Service
public class ChandramukiMedicineService {

     @Autowired
     ChandramukiMedicineRepository ChandramukimedicineRepository;

     public List<ChandramukiMedicine> getAllMedicines() {
          // List<Medicine> list ;
          return ChandramukimedicineRepository.findAll();
     }

     public ChandramukiMedicine addMedicine(ChandramukiMedicine medicine) {
          return ChandramukimedicineRepository.save(medicine);
     }

     public Optional<ChandramukiMedicine> getRequiredMedicin(int medicineId) {
          return ChandramukimedicineRepository.findById(medicineId);
     }

}
