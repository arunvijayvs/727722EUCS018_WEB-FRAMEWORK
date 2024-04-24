package com.example.bidirection.Arunvijayservice;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.bidirection.Arunrepository.ArunStudentInfoRepository;
import com.example.bidirection.Arunrepository.ArunStudentRepository;
import com.example.bidirection.Arunvijaymodel.ArunStudent;
import com.example.bidirection.Arunvijaymodel.ArunStudentInfo;

@Service
public class ArunStudentService {
    public ArunStudentRepository studentRepository;
    public ArunStudentInfoRepository studentInfoRepository;
    public ArunStudentService(ArunStudentRepository studentRepository,ArunStudentInfoRepository studentInfoRepository)
    {
        this.studentRepository = studentRepository;
        this.studentInfoRepository = studentInfoRepository;
    }
    public ArunStudent saveStudent(ArunStudent student)
    {
        return studentRepository.save(student);
    }
    public ArunStudentInfo saveStudentInfo(ArunStudentInfo studentInfo)
    {
        return studentInfoRepository.save(studentInfo);
    }
    public List<ArunStudent> getStudents()
    {
        return studentRepository.findAll();
    }
}
