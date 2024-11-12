package com.example.projetbiblotheque.repositories;

import com.example.projetbiblotheque.model.Emprunt;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface empruntRepository extends JpaRepository<Emprunt, Long> {


    List<Emprunt> findByUtilisateurId(Long userId);
}
