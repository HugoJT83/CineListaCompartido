package com.example.cinelista.repository;

import java.util.Collection;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Component;

import com.example.cinelista.model.Pelicula;

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
        if (peliculas.containsKey(id)) {
            return Optional.of(peliculas.get(id));
        }
        return Optional.empty();
    }

    public Pelicula save(Pelicula pelicula) {
        long id = idSequence.incrementAndGet();
        pelicula.setId(id);
        peliculas.put(id, pelicula);
        return pelicula;
    }

    public boolean deleteById(Long id) {
        if (peliculas.containsKey(id)) {
            peliculas.remove(id);
            return true;
        }
        return false;
    }
}