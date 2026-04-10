package com.library.project.holamundo.repository;

import com.library.project.holamundo.model.Prestamo;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class PrestamoRepository {
    private List<Prestamo> listaPrestamos = new ArrayList<>();

    public List<Prestamo> obtenerTodos() {
        return listaPrestamos;
    }

    public Prestamo guardar(Prestamo prestamo) {
        listaPrestamos.add(prestamo);
        return prestamo;
    }

    public Prestamo buscarPorId(int id) {
        return listaPrestamos.stream()
                .filter(p -> p.getId_prestamo() == id)
                .findFirst()
                .orElse(null);
    }
    public PrestamoRepository() {
    // Cargamos un préstamo inicial para que el navegador no parta vacío
    // Nota: java.util.Date() sin parámetros pone la fecha y hora actual
    this.listaPrestamos.add(new Prestamo(
        1, 
        4, 
        "12.345.678-9", 
        new java.util.Date(), 
        null, 
        7, 
        0
    ));
}
}