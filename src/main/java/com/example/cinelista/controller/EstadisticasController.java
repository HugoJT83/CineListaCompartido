package com.example.cinelista.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.cinelista.model.Estadistica;

/**
 * Seccion "Estadisticas".
 *
 * Aqui solo se resuelve la ruta de la pagina (/estadisticas). A diferencia
 * de "Estrenos", aqui teneis que anadir vosotros el controlador REST
 * GET /api/estadisticas devolviendo datos estatico: ese endpoint NO esta
 * implementado todavia.
 *
 * TODO: cuando el modelo Estadistica tenga mas campos,
 * actualizad tambien esta lista estatica con esos datos. Listo
 */
@Controller
public class EstadisticasController {

    private static final List<Estadistica> ESTADISTICAS = List.of(
            new Estadistica(1L, "Nebula Roja", "Ciencia ficcion", 82000000L, 8),
            new Estadistica(2L, "El Ultimo Faro", "Drama", 15000000L, 9),
            new Estadistica(3L, "Codigo Fantasma", "Thriller", 47000000L, 7),
            new Estadistica(4L, "Risas de Medianoche", "Comedia", 23000000L, 6),
            new Estadistica(5L, "Fuego Cruzado", "Accion", 96000000L, 8));

    @GetMapping("/estadisticas")
    public String estadisticas() {
        return "estadisticas";
    }

    // TODO:
    // @GetMapping("/api/estadisticas")
    // @ResponseBody
    // public List<?> apiEstadisticas() { ... }

    @GetMapping("/api/estadisticas")
    @ResponseBody
    public List<Estadistica> apiEstadisticas() {
        return ESTADISTICAS;
    }
}