package com.library.project.holamundo.controller;

import com.library.project.holamundo.model.Prestamo;
import com.library.project.holamundo.service.PrestamoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/prestamos")
public class PrestamoController {

    @Autowired
    private PrestamoService prestamoService;

    @GetMapping
    public List<Prestamo> listarPrestamos() {
        return prestamoService.getPrestamos();
    }

    @PostMapping
    public Prestamo crearPrestamo(@RequestBody Prestamo prestamo) {
        return prestamoService.savePrestamo(prestamo);
    }

    @GetMapping("/{id}")
    public Prestamo obtenerPrestamo(@PathVariable int id) {
        return prestamoService.getPrestamoId(id);
    }
}