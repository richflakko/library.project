package com.library.project.holamundo.service;

import com.library.project.holamundo.model.Libro;
import com.library.project.holamundo.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service // [cite: 474]
public class LibroService {

    @Autowired // [cite: 476, 508]
    private LibroRepository libroRepository;

    public List<Libro> getLibros() {
        return libroRepository.obtenerLibros(); // [cite: 479]
    }

    public Libro saveLibro(Libro libro) {
        return libroRepository.guardar(libro); // [cite: 482]
    }

    public Libro getLibroId(int id) {
        return libroRepository.buscarPorId(id); // [cite: 485]
    }

    // Este es el método que te faltaba o estaba mal nombrado
    public Libro updateLibro(Libro libro) {
        return libroRepository.actualizar(libro); // [cite: 488]
    }

    public String deleteLibro(int id) {
        libroRepository.eliminar(id); // [cite: 491]
        return "producto eliminado"; // [cite: 492]
    }
}