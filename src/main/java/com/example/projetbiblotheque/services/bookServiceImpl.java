package com.example.projetbiblotheque.services;



import com.example.projetbiblotheque.model.Book;
import com.example.projetbiblotheque.repositories.bookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class bookServiceImpl implements bookService {
    @Autowired
    private bookRepository livreRepository;

    @Override
    public List<Book> getAlllivres() {
        return livreRepository.findAll();
    }

    @Override
    public Book getlivreById(Long id) {
        return livreRepository.findById(id).orElse(null);
    }

    @Override
    public Book addlivre(Book livre) {
        return livreRepository.save(livre);
    }

    @Override
    public void deletelivre(Long id) {
        livreRepository.deleteById(id);
    }
}
