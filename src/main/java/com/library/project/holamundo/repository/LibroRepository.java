package com.library.project.holamundo.repository;

import com.library.project.holamundo.model.Libro;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository // [cite: 310, 443]
public class LibroRepository {
    private List<Libro> listaLibros = new ArrayList<>(); // [cite: 311, 334]

    public LibroRepository() {
        // Al iniciar, añadimos los 10 libros por defecto [cite: 885, 903]
        listaLibros.add(new Libro(1, "9789569646638", "Fuego y Sangre", "Penguin Random House", 2018, "George R. R. Martin"));
        listaLibros.add(new Libro(2, "9789563494150", "Quique Hache: El Mall Embrujado", "Sm Ediciones", 2014, "Sergio Gomez"));
        listaLibros.add(new Libro(3, "9781484256251", "Spring Boot Persistence", "Apress", 2020, "Anghel Leonard"));
        listaLibros.add(new Libro(4, "9789566075752", "Harry Potter y la piedra filosofal", "Salamandra", 2024, "J. K. Rowling"));
        listaLibros.add(new Libro(5, "9780439139601", "Harry Potter y el prisionero de Azkaban", "Scholastic", 1999, "J. K. Rowling"));
        listaLibros.add(new Libro(6, "9780439136365", "Harry Potter y el cáliz de fuego", "Scholastic", 2000, "J. K. Rowling"));
        listaLibros.add(new Libro(7, "9780321127426", "Effective Java", "Addison-Wesley", 2008, "Joshua Bloch"));
        listaLibros.add(new Libro(8, "9780134685991", "Clean Architecture", "Prentice Hall", 2017, "Robert C. Martin"));
        listaLibros.add(new Libro(9, "9780201633610", "Design Patterns", "Addison-Wesley", 1994, "Erich Gamma"));
        listaLibros.add(new Libro(10, "9780132350884", "Clean Code", "Prentice Hall", 2008, "Robert C. Martin"));
    }

    public List<Libro> obtenerLibros() { return listaLibros; } // [cite: 312, 340]
    public Libro guardar(Libro lib) { listaLibros.add(lib); return lib; } // [cite: 374, 376]
    public Libro buscarPorId(int id) {
        for (Libro l : listaLibros) { if (l.getId() == id) return l; } // [cite: 347, 350]
        return null;
    }
    public void eliminar(int id) { listaLibros.removeIf(l -> l.getId() == id); } // [cite: 411, 414, 442]
    public Libro actualizar(Libro lib) {
        for (int i = 0; i < listaLibros.size(); i++) {
            if (listaLibros.get(i).getId() == lib.getId()) { // [cite: 375, 381, 388]
                listaLibros.set(i, lib);
                return lib;
            }
        }
        return null;
    }
}