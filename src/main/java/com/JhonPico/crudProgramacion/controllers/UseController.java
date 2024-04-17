package com.JhonPico.crudProgramacion.controllers;


import com.JhonPico.crudProgramacion.dto.UserDTO;
import com.JhonPico.crudProgramacion.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UseController {
    @Autowired
    private UserService userService;
    @PostMapping("/guardar")
    public ResponseEntity<UserDTO>saveUserController(UserDTO obj){
        return ResponseEntity.ok(userService.saveUser(obj));

    }
    public ResponseEntity<List<UserDTO>> getAllUsersController(){
        return ResponseEntity.ok(userService.getUsers());
    }
}
