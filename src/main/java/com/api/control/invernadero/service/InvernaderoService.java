package com.api.control.invernadero.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.control.invernadero.entity.Invernadero;
import com.api.control.invernadero.repository.InvernaderoRepository;

@Service

public class InvernaderoService {
    @Autowired
    InvernaderoRepository invernaderoRepository;

    public Invernadero createInvernadero(Invernadero invernadero){
        return invernaderoRepository.save(invernadero);
    }

    public List<Invernadero> getAllInvernaderos(){
        return invernaderoRepository.findAll();
    }

    public Invernadero getInvernaderoById(Long id){
        return invernaderoRepository.findById(id).orElse(null);
    }

    public Invernadero updateInvernadero(Long id, Invernadero invernadero){
        invernadero.setId(id);
        return invernaderoRepository.save(invernadero);
    }

    public void deleteInvernadero(Long id){
        invernaderoRepository.deleteById(id);
    }

}
