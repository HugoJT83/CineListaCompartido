package com.example.cinelista.model;

/**
 * Representa un proximo estreno mostrado en la seccion de solo lectura
 * "Estrenos" (componente React TarjetaEstreno).
 *
 * De momento solo tiene "titulo", a juego con el resto del proyecto.
 *
 * TODO: anadid el resto de campos, con su getter y su setter:
 * - fechaEstreno (String)
 * - genero (String)
 * - plataforma (String)
 */
public class Estreno {

    private Long id;
    private String titulo;
    private String fechaEstreno;
    private String genero;
    private String plataforma;

    public Estreno() {
    }

    public Estreno(Long id, String titulo, String fechaEstreno, String genero, String plataforma) {
        this.id = id;
        this.titulo = titulo;
        this.fechaEstreno = fechaEstreno;
        this.genero = genero;
        this.plataforma = plataforma;
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

    public String getFechaEstreno() {
        return fechaEstreno;
    }

    public void setFechaEstreno(String fechaEstreno) {
        this.fechaEstreno = fechaEstreno;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }
}