package com.example.demo.ChandramukiService;

import java.util.List;
import org.springframework.data.domain.Sort;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.demo.ChandramukiModel.ChandramukiChildren;
import com.example.demo.ChandramukiRepository.ChandramukiChildrenRepo;

@Service
public class ChandramukiChildrenService {

     @Autowired
     public ChandramukiChildrenRepo childrenRepo;

     public List<ChandramukiChildren> sort(String field) {
          return childrenRepo.findAll(Sort.by(Sort.Direction.DESC, field));
     }

     public ChandramukiChildren save(ChandramukiChildren children) {
          return childrenRepo.save(children);

     }

     public List<ChandramukiChildren> sortedPage(int offset, int pagesize, String field) {
          Page<ChandramukiChildren> sortedPage = childrenRepo
                    .findAll(PageRequest.of(offset, pagesize, Sort.by(Sort.Direction.ASC, field)));
          return sortedPage.getContent();
     }

     public List<ChandramukiChildren> pagination(int offset, int pagesize) {
          Page<ChandramukiChildren> pages = childrenRepo.findAll(PageRequest.of(offset, pagesize));
          return pages.getContent();

     }

}
