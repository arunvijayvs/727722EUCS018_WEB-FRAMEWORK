package com.example.ce1.Arunservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ce1.Arunmodel.ArunAddress;
import com.example.ce1.Arunrepository.ArunAddressRepo;
import com.example.ce1.Arunrepository.ArunEmployeeRepo;

@Service
public class ArunAddressService {
    @Autowired
    ArunAddressRepo addressRepo;
    @Autowired
    ArunEmployeeRepo employeeRepo;
    public ArunAddress setAddressById(int id,ArunAddress address)
    {
        if(employeeRepo.existsById(id))
        {
            addressRepo.setByemployeeId(address.getCity(), address.getStreet(), id);
            return address;
        }
        else
        {
            return null;
        }
    }
}
