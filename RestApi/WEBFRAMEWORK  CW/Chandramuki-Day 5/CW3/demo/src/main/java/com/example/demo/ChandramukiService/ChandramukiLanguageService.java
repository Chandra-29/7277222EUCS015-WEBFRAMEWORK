package com.example.demo.ChandramukiService;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.ChandramukiModel.ChandramukiLanguage;
import com.example.demo.ChandramukiRepository.ChandramukiLanguageRepo;

@Service
public class ChandramukiLanguageService {
    private ChandramukiLanguageRepo languageRepo;
    public ChandramukiLanguageService(ChandramukiLanguageRepo languageRepo)
    {
        this.languageRepo=languageRepo;
    }
    public boolean saveLanguage(ChandramukiLanguage language)
    {
        try
        {
            languageRepo.save(language);

        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<ChandramukiLanguage> getLanguages()
    {
        return languageRepo.findAll();
    }
    public boolean updateLanguage(int id,ChandramukiLanguage language)
    {
        if(getLanguageById(id)==null)
        {
            return false;
        }
        try{
            languageRepo.save(language);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean deleteLanguage(int id)
    {
        if(getLanguageById(id)==null)
        {
            return false;
        }
        languageRepo.deleteById(id);
        return true;
        
    }
    public ChandramukiLanguage getLanguageById(int id)
    {
        return languageRepo.findById(id).orElse(null);
    }

}
