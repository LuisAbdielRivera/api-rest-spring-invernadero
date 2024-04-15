package com.api.control.invernadero.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.control.invernadero.entity.Usuario;

@Repository

public interface UsuarioRepository extends JpaRepository <Usuario, Long>{

}
