package com.api.control.invernadero.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.control.invernadero.entity.Usuario;
import com.api.control.invernadero.repository.UsuarioRepository;

@Service

public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    public Usuario createUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public List<Usuario> getAllUsuarios(){
        return usuarioRepository.findAll();
    }

    public Usuario getUsuarioById(Long id){
        return usuarioRepository.findById(id).orElse(null);
    }

    public Usuario updateUsuario(Long id, Usuario usuario){
        usuario.setId(id);
        return usuarioRepository.save(usuario);
    }

    public void deleteUsuario(Long id){
        usuarioRepository.deleteById(id);
    }
}
