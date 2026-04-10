package com.library.project.holamundo.model;

import java.util.Date;

public class Prestamo {
    private int id_prestamo;
    private int id_libro;
    private String run_solicitante;
    private Date fecha_solicitud;
    private Date fecha_entrega; // Puede ser null si no se ha devuelto
    private int cantidad_dias;
    private int multas;

    public Prestamo() {}

    public Prestamo(int id_prestamo, int id_libro, String run_solicitante, Date fecha_solicitud, Date fecha_entrega, int cantidad_dias, int multas) {
        this.id_prestamo = id_prestamo;
        this.id_libro = id_libro;
        this.run_solicitante = run_solicitante;
        this.fecha_solicitud = fecha_solicitud;
        this.fecha_entrega = fecha_entrega;
        this.cantidad_dias = cantidad_dias;
        this.multas = multas;
    }

    // Getters y Setters
    public int getId_prestamo() { return id_prestamo; }
    public void setId_prestamo(int id_prestamo) { this.id_prestamo = id_prestamo; }
    public int getId_libro() { return id_libro; }
    public void setId_libro(int id_libro) { this.id_libro = id_libro; }
    public String getRun_solicitante() { return run_solicitante; }
    public void setRun_solicitante(String run_solicitante) { this.run_solicitante = run_solicitante; }
    public Date getFecha_solicitud() { return fecha_solicitud; }
    public void setFecha_solicitud(Date fecha_solicitud) { this.fecha_solicitud = fecha_solicitud; }
    public Date getFecha_entrega() { return fecha_entrega; }
    public void setFecha_entrega(Date fecha_entrega) { this.fecha_entrega = fecha_entrega; }
    public int getCantidad_dias() { return cantidad_dias; }
    public void setCantidad_dias(int cantidad_dias) { this.cantidad_dias = cantidad_dias; }
    public int getMultas() { return multas; }
    public void setMultas(int multas) { this.multas = multas; }
}