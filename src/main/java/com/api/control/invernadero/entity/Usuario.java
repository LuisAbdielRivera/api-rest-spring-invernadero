package com.api.control.invernadero.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tbb_usuario")

public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido_paterno;
    private String apellido_materno;
    private String tipo;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido_paterno() {
        return apellido_paterno;
    }
    public void setApellido_paterno(String apellido_paterno) {
        this.apellido_paterno = apellido_paterno;
    }
    public String getApellido_materno() {
        return apellido_materno;
    }
    public void setApellido_materno(String apellido_materno) {
        this.apellido_materno = apellido_materno;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}