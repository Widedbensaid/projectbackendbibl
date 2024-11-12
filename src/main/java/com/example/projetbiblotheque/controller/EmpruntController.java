package com.example.projetbiblotheque.controller;

import com.example.projetbiblotheque.model.Emprunt;
import com.example.projetbiblotheque.services.emprunteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Emprunts")
public class EmpruntController {

    @Autowired
    private emprunteService EmpruntService;

    @GetMapping
    public List<Emprunt> getAllEmprunts() {
        return EmpruntService.getAllEmprunts();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Emprunt> getEmpruntById(@PathVariable Long id) {
        Emprunt Emprunt = EmpruntService.getEmpruntById(id);
        if (Emprunt != null) {
            return ResponseEntity.ok(Emprunt);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public Emprunt createEmprunt(@RequestBody Emprunt Emprunt) {
        return EmpruntService.createEmprunt(Emprunt);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Emprunt> updateEmprunt(@PathVariable Long id, @RequestBody Emprunt Emprunt) {
        Emprunt existingEmprunt = EmpruntService.getEmpruntById(id);
        if (existingEmprunt != null) {
            Emprunt.setId(id);
            return ResponseEntity.ok(EmpruntService.updateEmprunt(Emprunt));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmprunt(@PathVariable Long id) {
        Emprunt existingEmprunt = EmpruntService.getEmpruntById(id);
        if (existingEmprunt != null) {
            EmpruntService.deleteEmprunt(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/utilisateur/{utilisateurId}")
    public List<Emprunt> getEmpruntsByUtilisateur(@PathVariable Long utilisateurId) {
        return EmpruntService.getEmpruntsByUtilisateur(utilisateurId);
    }
}
