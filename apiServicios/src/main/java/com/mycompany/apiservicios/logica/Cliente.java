package com.mycompany.apiservicios.logica;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
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
public class Cliente implements Serializable {
    @Id
    private String cuit;
    @Basic
    private String razonSocial;
    private String mail;
    private List<Servicio> servicios = new ArrayList<>();

    public Cliente() {
    }

    public Cliente(String cuit, String razonSocial, String mail) {
        this.cuit = cuit;
        this.razonSocial = razonSocial;
        this.mail = mail;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public List<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(List<Servicio> servicios) {
        this.servicios = servicios;
    }
    
    
}
