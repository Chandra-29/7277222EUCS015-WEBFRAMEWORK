package com.example.demo.ChandramukiController;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ChandramukiModel.ChandramukiLanguage;
import com.example.demo.ChandramukiService.ChandramukiLanguageService;

@RestController
public class ChandramukiLanguageController {
    public ChandramukiLanguageService languageService;
    public ChandramukiLanguageController(ChandramukiLanguageService languageService)
    {
        this.languageService=languageService;
    }
    @PostMapping("/language")
    public ResponseEntity<ChandramukiLanguage> postMethodName(@RequestBody ChandramukiLanguage language) {
        
        if(languageService.saveLanguage(language)==true)
        {
            return new ResponseEntity<>(language,HttpStatus.CREATED);
        }
        return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
    }
    @GetMapping("/language")
    public ResponseEntity<List<ChandramukiLanguage>> getMethodName() {
        List<ChandramukiLanguage> list =  languageService.getLanguages();
        if(list.size() == 0)
        {
            return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(list,HttpStatus.OK);
    }
    @GetMapping("/language/{languageId}")
    public ResponseEntity<ChandramukiLanguage> getlangauge(@PathVariable("languageId") int id) {
        ChandramukiLanguage l =  languageService.getLanguageById(id);
        if(l == null)
        {
            return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(l,HttpStatus.OK);
    }
    
    @PutMapping("/language/{languageId}")
    public ResponseEntity<ChandramukiLanguage> putMethodName(@PathVariable int id, @RequestBody ChandramukiLanguage language) {
        if(languageService.updateLanguage(id,language) == true)
        {
            return new ResponseEntity<>(language,HttpStatus.OK);
        }
        return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
        
    }

    @DeleteMapping("/language/{languageId}")
    public ResponseEntity<ChandramukiLanguage> delete(@PathVariable("languageId") int id)
    {
        if(languageService.deleteLanguage(id)==true)
        {
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
