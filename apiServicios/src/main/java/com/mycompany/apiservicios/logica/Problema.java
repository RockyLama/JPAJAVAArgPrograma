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
public class Problema implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    @Basic
    private String descripcionDelProblema;
    private String tipoDeProblema;
    private double tiempoDeResolucion;

    public Problema() {
    }

    public Problema(int id, String descripcionDelProblema, String tipoDeProblema, double tiempoDeResolucion) {
        this.id = id;
        this.descripcionDelProblema = descripcionDelProblema;
        this.tipoDeProblema = tipoDeProblema;
        this.tiempoDeResolucion = tiempoDeResolucion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcionDelProblema() {
        return descripcionDelProblema;
    }

    public void setDescripcionDelProblema(String descripcionDelProblema) {
        this.descripcionDelProblema = descripcionDelProblema;
    }

    public String getTipoDeProblema() {
        return tipoDeProblema;
    }

    public void setTipoDeProblema(String tipoDeProblema) {
        this.tipoDeProblema = tipoDeProblema;
    }

    public double getTiempoDeResolucion() {
        return tiempoDeResolucion;
    }

    public void setTiempoDeResolucion(double tiempoDeResolucion) {
        this.tiempoDeResolucion = tiempoDeResolucion;
    }
    
    
}
