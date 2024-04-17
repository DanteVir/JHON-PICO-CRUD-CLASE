package com.JhonPico.crudProgramacion.services.impl;

import com.JhonPico.crudProgramacion.dto.UserDTO;
import com.JhonPico.crudProgramacion.entity.UserEntity;
import com.JhonPico.crudProgramacion.repositorio.UserDAO;
import com.JhonPico.crudProgramacion.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceimpl implements UserService {
    @Autowired
    private UserDAO userDAO;
    @Override
    public UserDTO saveUser(UserDTO userDTO) {
        UserEntity userEntity = UserEntity.builder()
                .idUser(userDTO.getIdUser())
                .name(userDTO.getName())
                .email(userDTO.getEmail())
                .birthdate(userDTO.getBirthdate())
                .build();
    }

        @Override
        public List<UserDTO> getUsers(){
        List<UserEntity> userEntities=userDAO.findAll();

        return userEntities.stream()
                .map
                .idUser(savedUser.getIdUser())
                .name(savedUser.getName())
                .email(savedUser.getEmail())
                .birthdate(savedUser.getBirthdate())
                .build())
            .toList();


    }


