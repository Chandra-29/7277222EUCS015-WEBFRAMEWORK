package com.example.demo.ChandraController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ChandraModel.ChandraPerson;
import com.example.demo.ChandraService.ChandraPersonService;


@RestController
public class ChandraPersonController {

     @Autowired
     public ChandraPersonService personService;

     @PostMapping("/api/person")
     public ResponseEntity<ChandraPerson> postMethodName(@RequestBody ChandraPerson entity) {

          ChandraPerson inst = personService.SaveEntity(entity);

          return new ResponseEntity<ChandraPerson>(inst, HttpStatus.CREATED);

     }

     @GetMapping("/api/person")
     public ResponseEntity<List<ChandraPerson>> getMethodName() {

          List<ChandraPerson> show = personService.getDetails();
          if (!show.isEmpty()) {
               return new ResponseEntity<List<ChandraPerson>>(show, HttpStatus.OK);
          } else {
               return new ResponseEntity<List<ChandraPerson>>(show, HttpStatus.NOT_FOUND);
          }
     }

     @GetMapping("api/person/byAge")
     public List<ChandraPerson> custom(@RequestParam int byAge) {
          return personService.findByAge(byAge);

     }
}