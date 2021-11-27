package com.br.rafael.projetocamadas.services;

import com.br.rafael.projetocamadas.dto.UserDTO;
import com.br.rafael.projetocamadas.entities.User;
import com.br.rafael.projetocamadas.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public UserDTO findByID(Long id) {
        User entity = repository.findById(id).get();
        UserDTO dto = new UserDTO(entity);
        return dto;
    }
}
