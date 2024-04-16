package com.api.control.invernadero.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.api.control.invernadero.entity.Reporte;

@Repository
public interface VerReporteRepository extends JpaRepository<Reporte, Long> {
    @Query("SELECT r.id, r.fecha, r.hora, r.observaciones FROM tbc_reporte r")
    List<Reporte> obtenerSoloDatos();

    @Query("SELECT r.id, r.fecha, r.hora, r.observaciones  FROM Reporte r")
    List<ViewReportProjection> findAllProjectedBy();
    
    // Método para obtener un informe por su ID con la proyección
    @Query("SELECT r.id, r.fecha, r.hora, r.observaciones  FROM Reporte r WHERE r.id = ?1")
    ViewReportProjection findByReportIDProjectedBy(Long id);

}
