package com.api.control.invernadero.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.api.control.invernadero.entity.Reporte;
import com.api.control.invernadero.service.ReporteService;

@RestController
@RequestMapping("/api/reporte")
public class ReporteController {
    @Autowired
    private ReporteService reporteService;

    @GetMapping
    @ResponseBody
    public List<Reporte> getAllReportes() {
        return reporteService.getAllReportes();
    }

    @PostMapping
    public Reporte createReporte(@RequestBody Reporte reporte){
        return reporteService.createReporte(reporte);
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Reporte getInvernaderoById(@PathVariable Long id){
        return reporteService.getInvernaderoById(id);
    }

    @PutMapping("/{id}")
    public Reporte updateReporte(@PathVariable Long id, @RequestBody Reporte reporte){
        return reporteService.updateReporte(id, reporte);
    }

    @DeleteMapping("/{id}")
    public void deleteReporte(@PathVariable Long id){
        reporteService.deleteReporte(id);
    }
}