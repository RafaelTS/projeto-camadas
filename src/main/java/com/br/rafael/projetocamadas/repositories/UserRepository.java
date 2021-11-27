package com.br.rafael.projetocamadas.repositories;

import com.br.rafael.projetocamadas.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
