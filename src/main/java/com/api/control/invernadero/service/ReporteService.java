package com.api.control.invernadero.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api.control.invernadero.entity.Reporte;
import com.api.control.invernadero.repository.ReporteRepository;

@Service

public class ReporteService {
    @Autowired
    ReporteRepository reporteRepository;

    public Reporte createReporte(Reporte reporte){
        return reporteRepository.save(reporte);
    }

    public List<Reporte> getAllReportes(){
        return reporteRepository.findAll();
    }

    public Reporte getInvernaderoById(Long id){
        return reporteRepository.findById(id).orElse(null);
    }

    public Reporte updateReporte(Long id, Reporte reporte){
        reporte.setId(id);
        return reporteRepository.save(reporte);
    }

    public void deleteReporte(Long id){
        reporteRepository.deleteById(id);
    }    
}
