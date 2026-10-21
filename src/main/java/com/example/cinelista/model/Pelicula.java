package com.example.cinelista.model;

/**
 * Representa una pelicula o serie del catalogo de CineLista.
 *
 * De momento solo tiene "titulo", a juego con el formulario minimo de
 * anadir-titulo.html.
 *
 * TODO: anadid el resto de campos, con su getter y su setter:
 *  - genero      (String)
 *  - plataforma  (String)
 *  - estado      (String: "vista" / "pendiente")
 *  - valoracion  (Integer, 0-10)
 */
public class Pelicula {

    private Long id;
    private String titulo;

    public Pelicula() {
    }

    public Pelicula(Long id, String titulo) {
        this.id = id;
        this.titulo = titulo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}