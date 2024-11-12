package com.example.projetbiblotheque.services;

import com.example.projetbiblotheque.model.User;
import com.example.projetbiblotheque.repositories.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userServiceImpl implements userService {

    @Autowired
    private userRepository userRepository;

    @Override
    public User registerUser(User user) {
        // Logique supplémentaire pour le mot de passe, la validation, etc.
        return userRepository.save(user);
    }

    @Override
    public User findUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public List<User> getAllUsers() {
        // Récupérer tous les utilisateurs de la base de données
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Long id) {
        // Chercher l'utilisateur par son ID, renvoyer null si non trouvé
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public User updateUser(User user) {
        // Vérifier si l'utilisateur existe avant de le mettre à jour
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        // Supprimer l'utilisateur par ID
        userRepository.deleteById(id);
    }
}
