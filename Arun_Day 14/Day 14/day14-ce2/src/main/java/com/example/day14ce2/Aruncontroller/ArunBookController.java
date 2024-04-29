package com.example.day14ce2.Aruncontroller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.day14ce2.Arunmodel.ArunBook;
import com.example.day14ce2.Arunservice.ArunBookService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "Book Controller" ,description = "null")
public class ArunBookController {
    @Autowired
    ArunBookService bookService;

    @PostMapping("/api/book")
    public ArunBook addBook(@RequestBody ArunBook book)
    {
        return bookService.addBook(book);
    }

    @PutMapping("/api/book/{id}")
    public ArunBook updateBook(@PathVariable int id,@RequestBody ArunBook book)
    {
        return bookService.updateBook(id,book);
    }

    @GetMapping("/api/book")
    public List<ArunBook> getBooks()
    {
        return bookService.getBooks();
    }

    @GetMapping("/api/book/{id}")
    public Optional<ArunBook> getBook(@PathVariable int id)
    {
        return bookService.getBook(id);
    }
}
