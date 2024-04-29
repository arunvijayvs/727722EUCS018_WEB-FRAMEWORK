package com.example.day14ce2.Arunservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day14ce2.Arunmodel.ArunBook;
import com.example.day14ce2.Arunrepository.ArunBookRepo;

@Service
public class ArunBookService {
   @Autowired
   ArunBookRepo bookRepo;

   public ArunBook addBook(ArunBook book)
   {
        return bookRepo.save(book);
   }

   public List<ArunBook> getBooks()
   {
        return bookRepo.findAll();
   }

   public Optional<ArunBook> getBook(int id)
   {
    return bookRepo.findById(id);
   }

   public ArunBook updateBook(int id,ArunBook book)
   {
        ArunBook avail = bookRepo.findById(id).orElse(null);
        if(avail!=null)
        {
            avail.setAuthor(book.getAuthor());
            avail.setAvailableCopies(book.getAvailableCopies());
            avail.setTitle(book.getTitle());
            avail.setTotalCopies(book.getTotalCopies());
            return bookRepo.save(avail);
        }
        else 
        return null;
   }
}
