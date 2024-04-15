package com.api.control.invernadero.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "tbb_invernadero")

public class Invernadero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fecha;
    private String hora;
    private String sen_humedad;
    private String sen_temp;
    private String ventilacion;

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
    public String getSen_humedad() {
        return sen_humedad;
    }
    public void setSen_humedad(String sen_humedad) {
        this.sen_humedad = sen_humedad;
    }
    public String getSen_temp() {
        return sen_temp;
    }
    public void setSen_temp(String sen_temp) {
        this.sen_temp = sen_temp;
    }
    public String getVentilacion() {
        return ventilacion;
    }
    public void setVentilacion(String ventilacion) {
        this.ventilacion = ventilacion;
    }
}
