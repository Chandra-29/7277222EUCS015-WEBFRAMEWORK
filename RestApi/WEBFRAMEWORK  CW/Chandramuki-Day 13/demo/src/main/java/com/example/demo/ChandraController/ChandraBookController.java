package com.example.demo.ChandraController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ChandraModel.ChandraBook;
import com.example.demo.ChandraService.ChandraBookService;

@RestController
public class ChandraBookController {
    @Autowired
    private ChandraBookService bookService;

    @GetMapping("/book/{bookId}")
    public ResponseEntity<ChandraBook> getBookById(@PathVariable Long bookId) {
        ChandraBook book = bookService.getBookById(bookId);
        if (book != null) {
            return new ResponseEntity<>(book, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
