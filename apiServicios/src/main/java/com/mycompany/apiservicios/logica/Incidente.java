package com.mycompany.apiservicios.logica;

import java.io.Serializable;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Incidente implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

    @Basic
    @ManyToOne
    @JoinColumn(name = "reclamo")
    private Problema problema;
    private boolean resuelto;
    @ManyToOne
    @JoinColumn(name = "reclamo_id")
    private Reclamo reclamo;
}
