package com.example.projetbiblotheque.repositories;
import com.example.projetbiblotheque.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}

