package com.library.project.holamundo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoController {

    @GetMapping("/hola")
    public String decirHola() {
        return "<h1>¡HOLA MUNDO!</h1><p>Proyecto Library Holamundo funcionando en JDK 24.</p>";
    }
}