package com.example.projetbiblotheque.services;

import com.example.projetbiblotheque.model.Emprunt;
import com.example.projetbiblotheque.repositories.empruntRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class empruntServiceImpl implements emprunteService {

    @Autowired
    private empruntRepository empruntRepository;

    @Override
    public List<Emprunt> getAllEmprunts() {
        return empruntRepository.findAll();
    }

    @Override
    public Emprunt getEmpruntById(Long id) {
        return empruntRepository.findById(id).orElse(null);
    }

    @Override
    public Emprunt createEmprunt(Emprunt Emprunt) {
        return empruntRepository.save(Emprunt);
    }

    @Override
    public Emprunt updateEmprunt(Emprunt Emprunt) {
        return empruntRepository.save(Emprunt);
    }

    @Override
    public void deleteEmprunt(Long id) {
        empruntRepository.deleteById(id);
    }

    @Override
    public List<Emprunt> getEmpruntsByUtilisateur(Long utilisateurId) {
        return empruntRepository.findByUtilisateurId(utilisateurId);
    }
}
