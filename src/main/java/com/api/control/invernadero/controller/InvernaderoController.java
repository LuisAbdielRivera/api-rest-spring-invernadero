package com.api.control.invernadero.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.api.control.invernadero.entity.Invernadero;
import com.api.control.invernadero.service.InvernaderoService;

@RestController
@RequestMapping("/api/control")
public class InvernaderoController {
    @Autowired
    private InvernaderoService invernaderoService;

    @GetMapping
    public List<Invernadero> getAllInvernaderos() {
        return invernaderoService.getAllInvernaderos();
    }

    @PostMapping
    public Invernadero creatInvernadero(@RequestBody Invernadero invernadero){
        return invernaderoService.createInvernadero(invernadero);
    }

    @GetMapping("/{id}")
    public Invernadero getInvernaderoById(@PathVariable Long id){
        return invernaderoService.getInvernaderoById(id);
    }

    @PutMapping("/{id}")
    public Invernadero updateInvernadero(@PathVariable Long id, @RequestBody Invernadero invernadero){
        return invernaderoService.updateInvernadero(id, invernadero);
    }

    @DeleteMapping("/{id}")
    public void deleteInvernadero(@PathVariable Long id){
        invernaderoService.deleteInvernadero(id);
    }

}
