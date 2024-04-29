package com.example.q1.Aruncontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.q1.Arunmodel.ArunAuthor;
import com.example.q1.Arunmodel.ArunBook;
import com.example.q1.Arunservice.ArunAuthorService;
import com.example.q1.Arunservice.ArunBookService;

@RestController
public class ArunAuthorController {
    @Autowired
    private ArunAuthorService authorService;
@Autowired
private ArunBookService bookService;
    @PostMapping("/author")
    public ResponseEntity<ArunAuthor> createAuthor(@RequestBody ArunAuthor author) {
        ArunAuthor savedAuthor = authorService.saveAuthor(author);
        return new ResponseEntity<>(savedAuthor, HttpStatus.CREATED);
    }

    @PostMapping("/book/author/{authorId}")
    public ResponseEntity<ArunBook> createBookForAuthor(@PathVariable Long authorId, @RequestBody ArunBook book) {
        ArunBook savedBook = bookService.saveBook(authorId, book);
        return new ResponseEntity<>(savedBook, HttpStatus.CREATED);
    }

    @GetMapping("/author/{authorId}")
    public ResponseEntity<ArunAuthor> getAuthorById(@PathVariable Long authorId) {
        ArunAuthor author = authorService.getAuthorById(authorId);
        if (author != null) {
            return new ResponseEntity<>(author, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/author")
    public ResponseEntity<List<ArunAuthor>> getAllAuthors() {
        List<ArunAuthor> authors = authorService.getAllAuthors();
        return new ResponseEntity<>(authors, HttpStatus.OK);
    }

    @PutMapping("/author/{authorId}")
    public ResponseEntity<ArunAuthor> updateAuthor(@PathVariable Long authorId, @RequestBody ArunAuthor author) {
        ArunAuthor updatedAuthor = authorService.updateAuthor(authorId, author);
        if (updatedAuthor != null) {
            return new ResponseEntity<>(updatedAuthor, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @DeleteMapping("/book/{bookId}")
    public ResponseEntity<String> deleteBook(@PathVariable Long bookId) {
        bookService.deleteBook(bookId);
        return new ResponseEntity<>("Book deleted successfully", HttpStatus.OK);
    }
}
