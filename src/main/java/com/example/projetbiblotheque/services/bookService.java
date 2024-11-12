package com.example.projetbiblotheque.services;

import com.example.projetbiblotheque.model.Book;

import java.util.List;

public interface bookService {
    List<Book> getAlllivres();
    Book getlivreById(Long id);
    Book addlivre(Book livre);
    void deletelivre(Long id);
}