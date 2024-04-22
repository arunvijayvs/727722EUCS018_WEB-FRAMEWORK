package com.example.day5cw3.Arunservice;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.day5cw3.Arunvijaymodel.ArunLanguage;
import com.example.day5cw3.Arunvijayrepository.Arun;

@Service
public class ArunLanguageService {
    private Arun languageRepo;
    public ArunLanguageService(Arun languageRepo)
    {
        this.languageRepo=languageRepo;
    }
    public boolean saveLanguage(ArunLanguage language)
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
    public List<ArunLanguage> getLanguages()
    {
        return languageRepo.findAll();
    }
    public boolean updateLanguage(int id,ArunLanguage language)
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
    public ArunLanguage getLanguageById(int id)
    {
        return languageRepo.findById(id).orElse(null);
    }

}
