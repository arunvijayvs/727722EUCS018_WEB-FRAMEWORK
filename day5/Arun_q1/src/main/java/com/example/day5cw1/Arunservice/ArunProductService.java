package com.example.day5cw1.Arunservice;

import org.springframework.stereotype.Service;

import com.example.day5cw1.Arunmodel.ArunProduct;
import com.example.day5cw1.Arunvijayrepository.ArunProductRepo;

@Service
public class ArunProductService {
    public ArunProductRepo productRepo;
    public ArunProductService(ArunProductRepo productRepo)
    {
        this.productRepo = productRepo;
    }
    public boolean saveProduct(ArunProduct product)
    {
        try
        {
            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean updateDetails(int id,ArunProduct product)
    {
        if(this.getProductById(id)==null)
        {
            return false;
        }
        try{
            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean deleteProduct(int id)
    {
        if(this.getProductById(id) == null)
        {
            return false;
        }
        productRepo.deleteById(id);
        return true;
    }
    public ArunProduct getProductById(int id)
    {
        return productRepo.findById(id).orElse(null);
    }
}
