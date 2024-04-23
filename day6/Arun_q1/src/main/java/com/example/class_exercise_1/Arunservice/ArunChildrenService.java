package com.example.class_exercise_1.Arunservice;

import java.util.List;
import org.springframework.data.domain.Sort;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.class_exercise_1.Arunmodel.ArunChildren;
import com.example.class_exercise_1.Arunvijayrepository.ArunChildrenRepo;

@Service
public class ArunChildrenService {

     @Autowired
     public ArunChildrenRepo childrenRepo;

     public List<ArunChildren> sort(String field) {
          return childrenRepo.findAll(Sort.by(Sort.Direction.DESC, field));
     }

     public ArunChildren save(ArunChildren children) {
          return childrenRepo.save(children);

     }

     public List<ArunChildren> sortedPage(int offset, int pagesize, String field) {
          Page<ArunChildren> sortedPage = childrenRepo
                    .findAll(PageRequest.of(offset, pagesize, Sort.by(Sort.Direction.ASC, field)));
          return sortedPage.getContent();
     }

     public List<ArunChildren> pagination(int offset, int pagesize) {
          Page<ArunChildren> pages = childrenRepo.findAll(PageRequest.of(offset, pagesize));
          return pages.getContent();

     }

}
