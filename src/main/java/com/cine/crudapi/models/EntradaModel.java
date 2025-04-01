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
@Table(name = "Entrada")
public class EntradaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int sesionId;
    private int butacaId;
    private String codigoEntrada;
    private int precio;
}
