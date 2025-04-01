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
@Table(name = "Butaca")
public class ButacaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int sesionId;
    private String numero;
    @Enumerated(EnumType.STRING)
    private TipoButaca tipoButaca;
    private int precio;
    private boolean reservada;
}

enum TipoButaca {
    NORMAL, VIP, MINUSVALIDO;
}