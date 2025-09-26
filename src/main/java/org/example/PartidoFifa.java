package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PartidoFifa {

    String fecha;
    String equipoLocal;
    String equipoVisitante;
    int golesVisitante;
    int golesLocal;
    String nombreTorneo;
    String ciudad;
    String pais;
    LocalDate fechaFormateada;
    DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public LocalDate getFechaFormateada() {
        return fechaFormateada;
    }

    public void setFechaFormateada(LocalDate fechaFormateada) {
        this.fechaFormateada = fechaFormateada;
    }

    public PartidoFifa(String fecha, String equipoLocal, String equipoVisitante, int golesVisitante, int golesLocal, String ciudad, String nombreTorneo, String pais) {
        this.fecha = fecha;
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.golesVisitante = golesVisitante;
        this.golesLocal = golesLocal;
        this.ciudad = ciudad;
        this.nombreTorneo = nombreTorneo;
        this.pais = pais;
        this.fechaFormateada = LocalDate.parse(this.fecha, f);
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(String equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public String getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(String equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    public void setGolesVisitante(int golesVisitante) {
        this.golesVisitante = golesVisitante;
    }

    public int getGolesLocal() {
        return golesLocal;
    }

    public void setGolesLocal(int golesLocal) {
        this.golesLocal = golesLocal;
    }

    public String getNombreTorneo() {
        return nombreTorneo;
    }

    public void setNombreTorneo(String nombreTorneo) {
        this.nombreTorneo = nombreTorneo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String toCSV() {
        return  fechaFormateada+","+equipoLocal+","+equipoVisitante+","+golesLocal+","+golesVisitante+","+nombreTorneo+","+ciudad+","+pais;
    }
    public String primerLineaCsv(){
        return "fechaFormateada,equipoLocal,equipoVisitante,golesVisitante,golesLocal,nombreTorneo,ciudad,+pais";
    }
}
