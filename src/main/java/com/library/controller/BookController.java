package com.library.controller;

import com.library.model.Book;
import com.library.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService service;

    public BookController(BookService service){
        this.service = service;
    }

    @GetMapping
    public List<Book> getBooks(){
        return service.getBooks();
    }

    @PostMapping
    public Book addBook(@RequestBody Book book){
        return service.addBook(book);
    }

    @GetMapping("/{id}")
    public Book getBook(@PathVariable Long id){
        return service.getBook(id);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id){
        service.deleteBook(id);
    }
}
