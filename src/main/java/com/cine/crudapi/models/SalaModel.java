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
@Table(name = "Sala")
public class SalaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int cineId;
    @Enumerated(EnumType.STRING)
    private TipoSala tipoSala;
    private int totalAsientosMinusvalidos;
    private int totalAsientosVip;
    private int precioTipoSala;
    private String imagenUrl;
}

enum TipoSala {
    SALA_NORMAL, SALA_3D, SALA_4D, SALA_DOLBY;
}
