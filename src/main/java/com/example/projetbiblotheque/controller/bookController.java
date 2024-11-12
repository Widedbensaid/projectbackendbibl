package com.example.projetbiblotheque.controller;

import com.example.projetbiblotheque.model.Book;
import com.example.projetbiblotheque.services.bookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/livres") // URL corrected to be all lowercase, as it's better practice
public class bookController {

    @Autowired
    private bookService livreService;

    // Récupérer tous les Livres
    @GetMapping
    public List<Book> getAllLivres() {
        return livreService.getAlllivres();
    }

    // Récupérer un Livre par son ID
    @GetMapping("/{id}")
    public ResponseEntity<Book> getLivreById(@PathVariable Long id) {
        Book livre = livreService.getlivreById(id);
        if (livre != null) {
            return ResponseEntity.ok(livre);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Créer un nouveau Livre
    @PostMapping
    public Book createLivre(@RequestBody Book livre) {
        return livreService.addlivre(livre);
    }

    // Mettre à jour un Livre existant
    @PutMapping("/{id}")
    public ResponseEntity<Book> updateLivre(@PathVariable Long id, @RequestBody Book livre) {
        Book existingLivre = livreService.getlivreById(id);
        if (existingLivre != null) {
            livre.setId(id); // S'assurer que l'ID est défini avant la mise à jour
            return ResponseEntity.ok(livreService.addlivre(livre)); // Utiliser save (addlivre)
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Supprimer un Livre
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteLivre(@PathVariable Long id) {
        Book existingLivre = livreService.getlivreById(id);
        if (existingLivre != null) {
            livreService.deletelivre(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
