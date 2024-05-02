package com.example.demo.ChandraController;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ChandraModel.ChandraPerson;
import com.example.demo.ChandraService.ChandraPersonService;

@RestController
public class ChandraPersonController {
    @Autowired
    private ChandraPersonService service;

    private static final Logger logger = LoggerFactory.getLogger(ChandraPersonController.class);

    @PostMapping("/persons")
    public ResponseEntity<ChandraPerson> create(@RequestBody ChandraPerson person) {
        logger.info("POST Request received for /persons ");
        return ResponseEntity.status(HttpStatus.CREATED).body(service.createPerson(person));
    }

    @GetMapping("/persons")
    public ResponseEntity<List<ChandraPerson>> getallpersons() {
        logger.debug("GET Request received for /persons");
        return ResponseEntity.ok(service.getAllPersons());
    }
}



