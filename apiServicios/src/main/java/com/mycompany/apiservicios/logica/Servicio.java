package com.mycompany.apiservicios.logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/*import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;*/

/*@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter*/
@Entity
public class Servicio implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    @Basic
    private String nombreServicio;
    private String descripcion;
    private String sistemaOperativo;

    public Servicio() {
    }

    public Servicio(int id, String nombreServicio, String descripcion, String sistemaOperativo) {
        this.id = id;
        this.nombreServicio = nombreServicio;
        this.descripcion = descripcion;
        this.sistemaOperativo = sistemaOperativo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreServicio() {
        return nombreServicio;
    }

    public void setNombreServicio(String nombreServicio) {
        this.nombreServicio = nombreServicio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }
    
    
}
