package com.example.cinelista.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.cinelista.model.Estreno;

/**
 * Seccion "Estrenos".
 *
 * La API GET /api/estrenos ya viene resuelta con datos estaticos: el
 * objetivo es consumirla desde el componente React TarjetaEstreno, no
 * construir el backend.
 *
 * La pagina /estrenos (estrenos.html) esta de momento vacia: ahi es donde
 * hay que incrustar React/Babel (CDN) y montar la lista de tarjetas dentro
 * de
 * <ul id="lista-estrenos">
 * .
 *
 * TODO: cuando el modelo Estreno tenga mas campos,
 * actualizad tambien esta lista estatica con esos datos.
 */
@Controller
public class EstrenosController {

    private static final List<Estreno> ESTRENOS = List.of(
            new Estreno(1L, "Nebula Roja", "2026-11-14", "Ciencia ficcion", "Netflix"),
            new Estreno(2L, "El Ultimo Faro", "2026-11-21", "Drama", "HBO Max"),
            new Estreno(3L, "Codigo Fantasma", "2026-12-05", "Thriller", "Amazon Prime Video"),
            new Estreno(4L, "Risas de Medianoche", "2026-12-12", "Comedia", "Disney+"));

    @GetMapping("/estrenos")
    public String estrenos() {
        return "estrenos";
    }

    @GetMapping("/api/estrenos")
    @ResponseBody
    public List<Estreno> apiEstrenos() {
        return ESTRENOS;
    }
}