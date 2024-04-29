package com.example.springapp.Arunservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.Arunmodel.ArunStudent;
import com.example.springapp.Arunrepository.ArunStudentRepository;

@Service
public class ArunStudentService {
    @Autowired
    ArunStudentRepository studentRepository;
    public ArunStudent addStudents(ArunStudent student)
    {
        return studentRepository.save(student);
    }
    public List<ArunStudent>getStudent()
    {
        return studentRepository.findAll();
    }
    public List<ArunStudent>getStudentInner()
    {
        return studentRepository.getStudentInner();
    }
    public List<ArunStudent>getStudentLeftOuter()
    {
        return studentRepository.getStudentsLeftOuter();
    }
    
}
