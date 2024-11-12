package com.example.projetbiblotheque.services;

import com.example.projetbiblotheque.model.Emprunt;

import java.util.List;

public interface emprunteService {

    List<Emprunt> getAllEmprunts();
    Emprunt getEmpruntById(Long id);
    Emprunt createEmprunt(Emprunt Emprunt);
    Emprunt updateEmprunt(Emprunt Emprunt);
    void deleteEmprunt(Long id);
    List<Emprunt> getEmpruntsByUtilisateur(Long utilisateurId);





}
