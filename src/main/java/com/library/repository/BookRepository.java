package com.library.repository;

import com.library.model.Book;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class BookRepository {

    private Map<Long,Book> books = new HashMap<>();
    private Long idCounter = 1L;

    public List<Book> findAll(){
        return new ArrayList<>(books.values());
    }

    public Book save(Book book){
        book.setId(idCounter++);
        books.put(book.getId(), book);
        return book;
    }

    public Book findById(Long id){
        return books.get(id);
    }

    public void delete(Long id){
        books.remove(id);
    }
}
