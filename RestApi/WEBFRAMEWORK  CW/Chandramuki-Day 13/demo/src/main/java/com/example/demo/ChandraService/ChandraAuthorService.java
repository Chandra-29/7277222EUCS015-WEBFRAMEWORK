package com.example.demo.ChandraService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ChandraModel.ChandraAuthor;
import com.example.demo.ChandraRepository.ChandraAuthorRepository;

@Service
public class ChandraAuthorService {
    @Autowired
    private ChandraAuthorRepository authorRepository;

    public ChandraAuthor saveAuthor(ChandraAuthor author) {
        return authorRepository.save(author);
    }

    public ChandraAuthor getAuthorById(Long id) {
        return authorRepository.findById(id).orElse(null);
    }

    public List<ChandraAuthor> getAllAuthors() {
        return authorRepository.findAll();
    }

    public ChandraAuthor updateAuthor(Long id, ChandraAuthor author) {
        ChandraAuthor existingAuthor = authorRepository.findById(id).orElse(null);
        if (existingAuthor != null) {
            existingAuthor.setEmail(author.getEmail());
            existingAuthor.setPhoneNumber(author.getPhoneNumber());
            existingAuthor.setAddress(author.getAddress());
            return authorRepository.save(existingAuthor);
        }
        return null;
    }

    public void deleteAuthor(Long id) {
        authorRepository.deleteById(id);
    }
}
