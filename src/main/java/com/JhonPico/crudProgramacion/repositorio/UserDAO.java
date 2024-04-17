package com.JhonPico.crudProgramacion.repositorio;

import com.JhonPico.crudProgramacion.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<UserEntity, Long> {
}
