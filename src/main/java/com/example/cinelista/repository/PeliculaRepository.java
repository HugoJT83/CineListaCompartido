package com.example.cinelista.repository;

import com.example.cinelista.model.Pelicula;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Almacen en memoria de peliculas/series. No hay base de datos: es
 * suficiente para el alcance de esta asignatura (Desarrollo de Interfaces).
 */
@Component
public class PeliculaRepository {

    private final Map<Long, Pelicula> peliculas = new ConcurrentHashMap<>();
    private final AtomicLong idSequence = new AtomicLong();

    public Collection<Pelicula> findAll() {
        return peliculas.values();
    }

    public Optional<Pelicula> findById(Long id) {
        // TODO: buscar y devolver la pelicula con ese id (Optional.empty() si no existe).
        return Optional.empty();
    }

    public Pelicula save(Pelicula pelicula) {
        long id = idSequence.incrementAndGet();
        pelicula.setId(id);
        peliculas.put(id, pelicula);
        return pelicula;
    }

    public boolean deleteById(Long id) {
        // TODO: eliminar la pelicula con ese id y devolver true/false segun si existia.
        return false;
    }
}