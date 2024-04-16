package com.api.control.invernadero.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api.control.invernadero.dto.VerReporteDto;
import com.api.control.invernadero.repository.VerReporteRepository;

@Service
public class VerReporteService {

    @Autowired
    private VerReporteRepository verReporteRepository;

    public List<VerReporteDto> getAllVerReporte() {
        return verReporteRepository.findAllCustom();
    }
}
