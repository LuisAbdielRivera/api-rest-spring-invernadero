package com.api.control.invernadero.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/bienvenido")
public class BienvenidoController {

    @GetMapping
    public String bienvenido() {
        return "Bienvenido al Invernadero";
    }
}
