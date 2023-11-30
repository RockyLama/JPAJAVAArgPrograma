package com.mycompany.apiservicios.logica;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
public class Tecnico implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    @Basic
    private String nombre;
    private List<String> especialidades = new ArrayList<>();
    private List<String> resolucionDeProblemas = new ArrayList<>();
    private String medioDeNotificacion;

    public Tecnico(String nombre, String medioDeNotificacion) {
        this.nombre = nombre;
        this.medioDeNotificacion = medioDeNotificacion;
    }

    public Tecnico() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(List<String> especialidades) {
        this.especialidades = especialidades;
    }

    public List<String> getResolucionDeProblemas() {
        return resolucionDeProblemas;
    }

    public void setResolucionDeProblemas(List<String> resolucionDeProblemas) {
        this.resolucionDeProblemas = resolucionDeProblemas;
    }

    public String getMedioDeNotificacion() {
        return medioDeNotificacion;
    }

    public void setMedioDeNotificacion(String medioDeNotificacion) {
        this.medioDeNotificacion = medioDeNotificacion;
    }
    
    
}
