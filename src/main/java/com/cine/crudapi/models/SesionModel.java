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
@Table(name = "Sesion")
public class SesionModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int salaId;
    private int peliculaId;
    private String horaFecha;
}
