package com.example.cinelista.model;

/**
 * Representa una pelicula o serie del catalogo de CineLista.
 *
 * De momento solo tiene "titulo", a juego con el formulario minimo de
 * anadir-titulo.html.
 *
 * TODO: anadid el resto de campos, con su getter y su setter:
 * - genero (String)
 * - plataforma (String)
 * - estado (String: "vista" / "pendiente")
 * - valoracion (Integer, 0-10)
 */
public class Pelicula {

    private Long id;
    private String titulo;
    private String genero;
    private String plataforma;
    private String estado;
    private int valoracion;

    public Pelicula() {
    }

    public Pelicula(Long id, String titulo, String genero, String plataforma, String estado, int valoracion) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.plataforma = plataforma;
        setEstado(estado);
        setValoracion(valoracion);
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

    public String getEstado() {
        return estado;
    }

    public final void setEstado(String estado) {
        if (!"vista".equals(estado) && !"pendiente".equals(estado)) {
            throw new IllegalArgumentException("El estado debe ser 'vista' o 'pendiente'.");
        }
        this.estado = estado;
    }

    public int getValoracion() {
        return valoracion;
    }

    public final void setValoracion(int valoracion) {
        if (valoracion < 0 || valoracion > 10) {
            throw new IllegalArgumentException("La valoración debe ser un valor entre 0 y 10.");
        }
        this.valoracion = valoracion;
    }

}