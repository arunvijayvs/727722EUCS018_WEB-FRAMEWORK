package com.example.relation.Arunvijayservice;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.relation.Arunvijaymodel.ArunStudent;
import com.example.relation.Arunvijayrepository.ArunStudentRepository;

@Service
public class ArunStudentService {
    public ArunStudentRepository studentRepository;
    public ArunStudentService(ArunStudentRepository studentRepository)
    {
        this.studentRepository = studentRepository;
    }
    public ArunStudent saveStudent(ArunStudent student)
    {
        return studentRepository.save(student);
    }
    public List<ArunStudent> getStudents()
    {
        return studentRepository.findAll();
    }
}
