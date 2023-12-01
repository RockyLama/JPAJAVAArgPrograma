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
public class Servicio implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    @Basic
    private String nombreServicio;
    private String descripcion;
    private String sistemaOperativo;
    @ManyToOne
    @JoinColumn(name = "cuit")
    private Cliente cliente;
}
