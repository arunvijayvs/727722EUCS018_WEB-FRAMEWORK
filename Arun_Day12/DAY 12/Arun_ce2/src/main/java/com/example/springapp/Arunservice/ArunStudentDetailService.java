package com.example.springapp.Arunservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.Arunmodel.ArunStudentDetail;
import com.example.springapp.Arunrepository.ArunStudentDetailRepository;
import com.example.springapp.Arunrepository.ArunStudentRepository;

@Service
public class ArunStudentDetailService {
    @Autowired
    ArunStudentDetailRepository studentDetailRepository;
    @Autowired
    ArunStudentRepository studentRepository;
    public ArunStudentDetail addStudentDetail(int id,ArunStudentDetail studentDetail)
    {
        if(studentRepository.existsById(id))
        {
            studentDetailRepository.addStudentDetail(studentDetail.getAddress(),studentDetail.getPhoneNumber(),id);
            return studentDetail;
        }
        else
        return null;
    }
    
    
}
