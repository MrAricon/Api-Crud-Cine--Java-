package com.cine.crudapi.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author paucanmil
 */
@Getter
@Setter
@Entity
@Table(name = "Pelicula")
public class PeliculaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String titulo;
    private int duracion;
    private String idioma;
    private String descripcion;
    private String genero;
    private double valoracion;
    private String director;
    private String imagenUrl;
    private String trailerUrl;
}
