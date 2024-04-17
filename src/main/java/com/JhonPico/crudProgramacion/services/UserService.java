package com.JhonPico.crudProgramacion.services;

import com.JhonPico.crudProgramacion.dto.UserDTO;
import org.springframework.boot.autoconfigure.security.SecurityProperties;

import java.util.List;

public interface UserService {
    UserDTO saveUser(UserDTO UserDTO);
    List<UserDTO> getUsers();
}
