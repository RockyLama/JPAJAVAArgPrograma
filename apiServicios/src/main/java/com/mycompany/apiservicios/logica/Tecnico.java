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
public class Tecnico implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    @Basic
    private String nombre;
    private List<String> especialidades = new ArrayList<>();
    private List<String> resolucionDeProblemas = new ArrayList<>();
    private String medioDeNotificacion;
    @OneToMany(mappedBy = "tecnico")
    private List<Reclamo> reclamos;
}
