package com.example.demo.ChandraRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.ChandraModel.ChandraBook;
@Repository
public interface ChandraBookRepository extends JpaRepository<ChandraBook, Long> {
}
