package com.consultorio.proyectoconsultorio.model;


import java.time.LocalDate;

public class Turno {
    private Long idTurno;
    private String motivoConsulta;
    private LocalDate fecha; 

    public Turno(){

    }
    public Turno(String mensaje, LocalDate fecha){
        this.motivoConsulta = mensaje;
        this.fecha = fecha;

    }
    public Long getIdTurno() {
        return idTurno;
    }

    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    public void setMotivoConsulta(String mensaje) {
        this.motivoConsulta = mensaje;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
    
}
