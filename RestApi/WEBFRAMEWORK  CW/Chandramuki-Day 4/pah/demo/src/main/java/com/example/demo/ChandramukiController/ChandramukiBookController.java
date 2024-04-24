package com.example.demo.ChandramukiController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ChandramukiModel.ChandramukiBook;
import com.example.demo.ChandramukiService.ChandramukiBookService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class ChandramukiBookController {

     @Autowired
     public ChandramukiBookService bookService;

     List<ChandramukiBook> list;

     @PostMapping("/api/book")
     public ResponseEntity<ChandramukiBook> postMethodName(@RequestBody ChandramukiBook entity) {

          ChandramukiBook inst = bookService.SaveEntity(entity);

          return new ResponseEntity<ChandramukiBook>(inst, HttpStatus.CREATED);

     }

     @GetMapping("/api/book")
     public ResponseEntity<List<ChandramukiBook>> getMethodName() {

          List<ChandramukiBook> show = bookService.getDetails();
          if (!show.isEmpty()) {
               return new ResponseEntity<List<ChandramukiBook>>(show, HttpStatus.OK);
          } else {
               return new ResponseEntity<List<ChandramukiBook>>(show, HttpStatus.NOT_FOUND);
          }
     }

     @GetMapping("api/book/{bookId}")
     public ChandramukiBook getMethodName(@PathVariable int bookId) {

          ChandramukiBook getid = bookService.getBookById(bookId);
        return getid;

     }

}
