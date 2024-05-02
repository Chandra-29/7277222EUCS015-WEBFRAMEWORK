package com.example.demo.ChandraController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ChandraModel.ChandraAuthor;
import com.example.demo.ChandraModel.ChandraBook;
import com.example.demo.ChandraService.ChandraAuthorService;
import com.example.demo.ChandraService.ChandraBookService;

@RestController
public class ChandraAuthorController {
    @Autowired
    private ChandraAuthorService authorService;
@Autowired
private ChandraBookService bookService;
    @PostMapping("/author")
    public ResponseEntity<ChandraAuthor> createAuthor(@RequestBody ChandraAuthor author) {
        ChandraAuthor savedAuthor = authorService.saveAuthor(author);
        return new ResponseEntity<>(savedAuthor, HttpStatus.CREATED);
    }

    @PostMapping("/book/author/{authorId}")
    public ResponseEntity<ChandraBook> createBookForAuthor(@PathVariable Long authorId, @RequestBody ChandraBook book) {
        ChandraBook savedBook = bookService.saveBook(authorId, book);
        return new ResponseEntity<>(savedBook, HttpStatus.CREATED);
    }

    @GetMapping("/author/{authorId}")
    public ResponseEntity<ChandraAuthor> getAuthorById(@PathVariable Long authorId) {
        ChandraAuthor author = authorService.getAuthorById(authorId);
        if (author != null) {
            return new ResponseEntity<>(author, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/author")
    public ResponseEntity<List<ChandraAuthor>> getAllAuthors() {
        List<ChandraAuthor> authors = authorService.getAllAuthors();
        return new ResponseEntity<>(authors, HttpStatus.OK);
    }

    @PutMapping("/author/{authorId}")
    public ResponseEntity<ChandraAuthor> updateAuthor(@PathVariable Long authorId, @RequestBody ChandraAuthor author) {
        ChandraAuthor updatedAuthor = authorService.updateAuthor(authorId, author);
        if (updatedAuthor != null) {
            return new ResponseEntity<>(updatedAuthor, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @DeleteMapping("/book/{bookId}")
    public ResponseEntity<String> deleteBook(@PathVariable Long bookId) {
        bookService.deleteBook(bookId);
        return new ResponseEntity<>("Book deleted successfully", HttpStatus.OK);
    }
}

