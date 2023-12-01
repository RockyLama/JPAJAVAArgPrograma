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
public class Cliente implements Serializable {
    @Id
    @Column(name = "CUIT")
    private String cuit;
    @Basic
    private String razonSocial;
    private String mail;
    @OneToMany(mappedBy = "cliente")
    private List<Servicio> servicios = new ArrayList<>();
    @OneToMany(mappedBy = "cliente")
    private List<Reclamo> reclamos;
}
