package com.mycompany.apiservicios.logica;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
public class Reclamo implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @OneToMany(mappedBy = "reclamo")
    @JoinColumn(name = "reclamo_id")
    private List<Incidente> incidentes = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "CLIENTE_CUIT")
    private Cliente cliente;
    @ManyToOne
    @JoinColumn(name = "TECNICO_ID")
    private Tecnico tecnico;
    private String consideraciones;
}
