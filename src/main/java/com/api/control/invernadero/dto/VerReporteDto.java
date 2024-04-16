package com.api.control.invernadero.dto;

public class VerReporteDto {
    private Long id;
    private String fecha;
    private String hora;
    private String observaciones;

    public VerReporteDto(Long id, String fecha, String hora, String observaciones) {
        this.id = id;
        this.fecha = fecha;
        this.hora = hora;
        this.observaciones = observaciones;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}
