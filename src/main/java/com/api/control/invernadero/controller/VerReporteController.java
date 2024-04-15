package com.api.control.invernadero.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.api.control.invernadero.entity.Reporte;
import com.api.control.invernadero.service.ReporteService;

@RestController
@RequestMapping("/api/VerReporte")
public class VerReporteController {
    @Autowired
    private ReporteService reporteService;

    @GetMapping
    @ResponseBody
    public List<Reporte> getAllReportes() {
        return reporteService.getAllReportes();
    }

}
