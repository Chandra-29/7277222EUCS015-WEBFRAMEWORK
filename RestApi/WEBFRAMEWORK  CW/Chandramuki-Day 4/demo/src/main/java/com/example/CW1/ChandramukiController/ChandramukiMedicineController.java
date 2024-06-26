package com.example.CW1.ChandramukiController;

import org.springframework.web.bind.annotation.RestController;

import com.example.CW1.ChandramukiModel.ChandramukiMedicine;
import com.example.CW1.ChandramukiService.ChandramukiMedicineService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class ChandramukiMedicineController {

     @Autowired
     public ChandramukiMedicineService medicineService;

     @GetMapping("/api/medicines")
     public ResponseEntity<List<ChandramukiMedicine>> getMethodName() {

          List<ChandramukiMedicine> medicines = medicineService.getAllMedicines();
          if (medicines.isEmpty()) {
               return new ResponseEntity<>(medicines, HttpStatus.NOT_FOUND);

          } else {

               return new ResponseEntity<>(medicines, HttpStatus.CREATED);
          }
     }

     @PostMapping("/api/medicine")
     public ResponseEntity<ChandramukiMedicine> postMethodName(@RequestBody ChandramukiMedicine medicine) {

          ChandramukiMedicine tablet = medicineService.addMedicine(medicine);
          return new ResponseEntity<>(tablet, HttpStatus.OK);
     }

     @GetMapping("/api/medicine/{medicineId}")
     public ResponseEntity<Optional<ChandramukiMedicine>> SearchMedicine(@PathVariable int medicineId) {
          Optional<ChandramukiMedicine> search = medicineService.getRequiredMedicin(medicineId);
          if (search.isPresent()) {

               return new ResponseEntity<>(search, HttpStatus.OK);
          } else {
               return new ResponseEntity<>(search, HttpStatus.NOT_FOUND);
          }

     }

}
