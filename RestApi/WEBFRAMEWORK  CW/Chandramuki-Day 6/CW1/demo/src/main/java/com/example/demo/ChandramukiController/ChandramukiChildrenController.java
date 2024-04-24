package com.example.demo.ChandramukiController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ChandramukiModel.ChandramukiChildren;
import com.example.demo.ChandramukiService.ChandramukiChildrenService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class ChandramukiChildrenController {

     @Autowired
     public ChandramukiChildrenService childrenService;

     @GetMapping("/api/children/sortBy/{babyFirstName}")
     public ResponseEntity<List<ChandramukiChildren>> sort(@PathVariable String babyFirstName) {
          List<ChandramukiChildren> child = childrenService.sort(babyFirstName);

          if (child.isEmpty()) {

               return new ResponseEntity<>(child, HttpStatus.NOT_FOUND);
          }
          return new ResponseEntity<>(child, HttpStatus.OK);

     }

     // Pagination
     @GetMapping("api/children/{offset}/{pagesize}")
     public ResponseEntity<List<ChandramukiChildren>> pagination(@PathVariable int offset, @PathVariable int pagesize) {
          List<ChandramukiChildren> pages = childrenService.pagination(offset, pagesize);
          if (pages.isEmpty()) {
               return new ResponseEntity<List<ChandramukiChildren>>(pages, HttpStatus.NOT_FOUND);
          }
          return new ResponseEntity<List<ChandramukiChildren>>(pages, HttpStatus.OK);
     }

     @GetMapping("/api/children/{offset}/{pagesize}/{field}")
     public ResponseEntity<List<ChandramukiChildren>> sortedPage(@PathVariable int offset, @PathVariable int pagesize,
               @PathVariable String field) {
          List<ChandramukiChildren> sortedPage = childrenService.sortedPage(offset, pagesize, field);
          if (sortedPage.isEmpty()) {

               return new ResponseEntity<>(sortedPage, HttpStatus.NOT_FOUND);
          }
          return new ResponseEntity<>(sortedPage, HttpStatus.OK);
     }

     @PostMapping("/api/children")
     public ResponseEntity<ChandramukiChildren> postDetails(@RequestBody ChandramukiChildren children) {

          return new ResponseEntity<ChandramukiChildren>(childrenService.save(children), HttpStatus.CREATED);
     }

}