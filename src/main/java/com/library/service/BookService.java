package com.library.service;

import com.library.model.Book;
import com.library.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository repository;

    public BookService(BookRepository repository){
        this.repository = repository;
    }

    public List<Book> getBooks(){
        return repository.findAll();
    }

    public Book addBook(Book book){
        return repository.save(book);
    }

    public Book getBook(Long id){
        return repository.findById(id);
    }

    public void deleteBook(Long id){
        repository.delete(id);
    }
}
