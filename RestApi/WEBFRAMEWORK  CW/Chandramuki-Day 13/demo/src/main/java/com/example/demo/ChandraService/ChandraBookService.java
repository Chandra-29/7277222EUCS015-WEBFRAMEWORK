package com.example.demo.ChandraService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ChandraModel.ChandraAuthor;
import com.example.demo.ChandraModel.ChandraBook;
import com.example.demo.ChandraRepository.ChandraAuthorRepository;
import com.example.demo.ChandraRepository.ChandraBookRepository;

@Service
public class ChandraBookService {
    @Autowired
    private ChandraBookRepository bookRepository;
@Autowired
private ChandraAuthorRepository authorRepository;
    public ChandraBook saveBook(Long authorId, ChandraBook book) {
        ChandraAuthor author = authorRepository.findById(authorId).orElse(null);
        if (author != null) {
            book.setAuthor(author);
            author.getBooks().add(book);
            return bookRepository.save(book);
        }
        return null;
    }

    public ChandraBook getBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}

