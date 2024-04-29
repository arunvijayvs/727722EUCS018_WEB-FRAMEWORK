package com.example.q1.Arunservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.q1.Arunmodel.ArunAuthor;
import com.example.q1.Arunmodel.ArunBook;
import com.example.q1.Arunrepository.ArunAuthorRepository;
import com.example.q1.Arunrepository.ArunBookRepository;

@Service
public class ArunBookService {
    @Autowired
    private ArunBookRepository bookRepository;
@Autowired
private ArunAuthorRepository authorRepository;
    public ArunBook saveBook(Long authorId, ArunBook book) {
        ArunAuthor author = authorRepository.findById(authorId).orElse(null);
        if (author != null) {
            book.setAuthor(author);
            author.getBooks().add(book);
            return bookRepository.save(book);
        }
        return null;
    }

    public ArunBook getBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}

