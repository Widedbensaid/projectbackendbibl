package com.example.projetbiblotheque.repositories;

import com.example.projetbiblotheque.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface bookRepository extends JpaRepository<Book, Long> {
    Optional<Book> findByTitre(String titre);
}
