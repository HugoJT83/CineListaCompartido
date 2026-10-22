package com.example.cinelista.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.cinelista.model.Pelicula;
import com.example.cinelista.repository.PeliculaRepository;

/**
 * Controlador de las pantallas "Mi lista" y "Anadir titulo".
 *
 * El listado ya esta conectado a PeliculaRepository para que el proyecto
 * arranque y funcione de extremo a extremo. El guardado (metodo guardar) y
 * el borrado (metodo eliminar) estan a medias: las rutas existen pero falta
 * completarlas. Ademas falta la parte de INTERFAZ: construir mi-lista.html y
 * anadir-titulo.html con el editor visual y Bootstrap, y comprobar que
 * quedan bien conectadas a estas rutas.
 */
@Controller
public class PeliculaController {

    private final PeliculaRepository peliculaRepository;

    public PeliculaController(PeliculaRepository peliculaRepository) {
        this.peliculaRepository = peliculaRepository;
    }

    @GetMapping("/")
    public String home() {
        return "redirect:/mi-lista";
    }

    @GetMapping("/mi-lista")
    public String miLista(Model model) {
        model.addAttribute("peliculas", peliculaRepository.findAll());
        return "mi-lista";
    }

    @GetMapping("/anadir-titulo")
    public String formularioAnadir(Model model) {
        model.addAttribute("pelicula", new Pelicula());
        return "anadir-titulo";
    }

    @PostMapping("/anadir-titulo")
    public String guardar(@ModelAttribute Pelicula pelicula) {
        // TODO: guardar la pelicula en peliculaRepository antes de redirigir.
        peliculaRepository.save(pelicula);
        return "redirect:/mi-lista";
    }

    @PostMapping("/mi-lista/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {
        // TODO:
        // 1) Anadid en mi-lista.html un boton/formulario que haga POST a
        // esta misma ruta ("/mi-lista/eliminar/{id}") por cada pelicula.
        // 2) Llamad aqui a peliculaRepository.deleteById(id) para que el
        // boton borre de verdad la pelicula correspondiente.
        peliculaRepository.deleteById(id);
        return "redirect:/mi-lista";
    }
}