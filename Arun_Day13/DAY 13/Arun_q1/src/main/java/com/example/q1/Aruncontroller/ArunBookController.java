package com.example.q1.Aruncontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.q1.Arunmodel.ArunBook;
import com.example.q1.Arunservice.ArunBookService;

@RestController
public class ArunBookController {
    @Autowired
    private ArunBookService bookService;

    @GetMapping("/book/{bookId}")
    public ResponseEntity<ArunBook> getBookById(@PathVariable Long bookId) {
        ArunBook book = bookService.getBookById(bookId);
        if (book != null) {
            return new ResponseEntity<>(book, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
