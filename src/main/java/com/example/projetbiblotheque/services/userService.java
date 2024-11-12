package com.example.projetbiblotheque.services;

import com.example.projetbiblotheque.model.User;

import java.util.List;

public interface userService {

    // Méthode pour enregistrer un nouvel utilisateur
    User registerUser(User User);

    // Méthode pour trouver un utilisateur par email
    User findUserByEmail(String email);

    // Méthode pour récupérer tous les utilisateurs
    List<User> getAllUsers();

    // Méthode pour récupérer un utilisateur par ID
    User getUserById(Long id);

    // Méthode pour mettre à jour un utilisateur
    User updateUser(User User);

    // Méthode pour supprimer un utilisateur par ID
    void deleteUser(Long id);
}
