package com.api.control.invernadero.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.api.control.invernadero.dto.VerReporteDto;
import com.api.control.invernadero.service.VerReporteService;

@RestController
@RequestMapping("api/VerReporte")
public class VerReporteController {

    @Autowired
    private VerReporteService verReporteService;

    @GetMapping
    public ResponseEntity<List<VerReporteDto>> getAllVerreporte() {
        List<VerReporteDto> VerReporteDtos = verReporteService.getAllVerreporte()
                .stream()
                .map(reporte -> new VerReporteDto(reporte.getId(), reporte.getFecha(), reporte.getHora(), reporte.getObservaciones()))
                .collect(Collectors.toList());
        return new ResponseEntity<>(VerReporteDtos, HttpStatus.OK);
    }
    
}
