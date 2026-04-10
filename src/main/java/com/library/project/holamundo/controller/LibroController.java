package com.library.project.holamundo.controller;

import com.library.project.holamundo.model.Libro;
import com.library.project.holamundo.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController // Define que esta clase es un controlador REST [cite: 535]
@RequestMapping("/api/v1/libros") // Define la ruta base de la API [cite: 536]
public class LibroController {

    @Autowired // Inyecta el servicio automáticamente [cite: 538]
    private LibroService libroService;

    @GetMapping // Endpoint para listar todos los libros [cite: 549]
    public List<Libro> listarLibros() {
        return libroService.getLibros(); // Llama al método del servicio [cite: 550]
    }

    @PostMapping // Endpoint para agregar un nuevo libro [cite: 551]
    public Libro agregarLibro(@RequestBody Libro libro) {
        return libroService.saveLibro(libro); // Recibe el JSON y lo guarda [cite: 552, 554]
    }

    @GetMapping("/{id}") // Endpoint para buscar por ID [cite: 555]
    public Libro buscarLibro(@PathVariable int id) {
        return libroService.getLibroId(id); // [cite: 556]
    }

    @PutMapping("/{id}") // Endpoint para actualizar (el id se usará más adelante) [cite: 558]
    public Libro actualizarLibro(@PathVariable int id, @RequestBody Libro libro) {
        return libroService.updateLibro(libro); // [cite: 561]
    }

    @DeleteMapping("/{id}") // Endpoint para eliminar un recurso [cite: 562]
    public String eliminarLibro(@PathVariable int id) {
        return libroService.deleteLibro(id); // Devuelve mensaje de confirmación [cite: 564, 565]
    }
    @GetMapping("/total")
public int total() {
    return libroService.getLibros().size(); // Devuelve la cantidad de libros en la lista [cite: 1034]
}
}