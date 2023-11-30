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
public class Reclamo implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    @Basic
    private List<Incidente> incidentes = new ArrayList<>();
    private Cliente cliente;
    private Tecnico tecnico;
    private String consideraciones;

    public Reclamo() {
    }

    public Reclamo(int id, Cliente cliente, Tecnico tecnico, String consideraciones) {
        this.id = id;
        this.cliente = cliente;
        this.tecnico = tecnico;
        this.consideraciones = consideraciones;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Incidente> getIncidentes() {
        return incidentes;
    }

    public void setIncidentes(List<Incidente> incidentes) {
        this.incidentes = incidentes;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    public String getConsideraciones() {
        return consideraciones;
    }

    public void setConsideraciones(String consideraciones) {
        this.consideraciones = consideraciones;
    }
    
    
}
