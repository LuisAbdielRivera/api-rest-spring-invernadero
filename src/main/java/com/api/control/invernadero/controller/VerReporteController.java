package com.api.control.invernadero.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.api.control.invernadero.entity.Reporte;
import com.api.control.invernadero.repository.VerReporteRepository;

@RestController
@RequestMapping("/api/VerReporte")
public class VerReporteController {
    @Autowired
    private VerReporteRepository verReporteRepository;

    @GetMapping
    public List<Reporte> getAllReportes() {
        return verReporteRepository.obtenerSoloDatos();
    }
}
