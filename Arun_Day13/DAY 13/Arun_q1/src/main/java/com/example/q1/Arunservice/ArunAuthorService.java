package com.example.q1.Arunservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.q1.Arunmodel.ArunAuthor;
import com.example.q1.Arunrepository.ArunAuthorRepository;

@Service
public class ArunAuthorService {
    @Autowired
    private ArunAuthorRepository authorRepository;

    public ArunAuthor saveAuthor(ArunAuthor author) {
        return authorRepository.save(author);
    }

    public ArunAuthor getAuthorById(Long id) {
        return authorRepository.findById(id).orElse(null);
    }

    public List<ArunAuthor> getAllAuthors() {
        return authorRepository.findAll();
    }

    public ArunAuthor updateAuthor(Long id, ArunAuthor author) {
        ArunAuthor existingAuthor = authorRepository.findById(id).orElse(null);
        if (existingAuthor != null) {
            existingAuthor.setEmail(author.getEmail());
            existingAuthor.setPhoneNumber(author.getPhoneNumber());
            existingAuthor.setAddress(author.getAddress());
            return authorRepository.save(existingAuthor);
        }
        return null;
    }

    public void deleteAuthor(Long id) {
        authorRepository.deleteById(id);
    }
}
