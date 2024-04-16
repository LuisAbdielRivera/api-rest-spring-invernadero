package com.api.control.invernadero.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.api.control.invernadero.dto.VerReporteDto;
import com.api.control.invernadero.entity.Reporte;

@Repository
public interface VerReporteRepository extends JpaRepository<Reporte, Long> {
    @Query("SELECT new com.api.control.invernadero.dto.VerReporteDto(r.id, r.fecha, r.hora, r.observaciones) FROM Reporte r")
    List<VerReporteDto> findAllCustom();
}
