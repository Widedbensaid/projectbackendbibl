package com.example.projetbiblotheque.model;



import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "Emprunts")
public class Emprunt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "utilisateur_id")
    private User utilisateur;

    @ManyToOne
    @JoinColumn(name = "livre_id")
    private Book livre;

    @Temporal(TemporalType.DATE)
    private Date dateEmprunt;

    @Temporal(TemporalType.DATE)
    private Date dateRetour;

    private boolean retourne; // vrai si retourné, faux sinon
}
