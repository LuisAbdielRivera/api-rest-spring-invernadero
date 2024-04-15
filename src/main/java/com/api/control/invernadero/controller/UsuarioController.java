package com.api.control.invernadero.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.api.control.invernadero.entity.Usuario;
import com.api.control.invernadero.service.UsuarioService;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<Usuario> getAllUsuarios() {
        return usuarioService.getAllUsuarios();
    }

    @PostMapping
    public Usuario createUsuario(@RequestBody Usuario usuario){
        return usuarioService.createUsuario(usuario);
    }

    @GetMapping("/{id}")
    public Usuario getUsuarioById(@PathVariable Long id){
        return usuarioService.getUsuarioById(id);
    }

    @PutMapping("/{id}")
    public Usuario updateUsuario(@PathVariable Long id, @RequestBody Usuario usuario){
        return usuarioService.updateUsuario(id, usuario);
    }

    @DeleteMapping("/{id}")
    public void deleteUsuario(@PathVariable Long id){
        usuarioService.deleteUsuario(id);
    }
}