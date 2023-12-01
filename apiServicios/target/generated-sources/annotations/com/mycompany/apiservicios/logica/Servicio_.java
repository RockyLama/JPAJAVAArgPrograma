package com.mycompany.apiservicios.logica;

import com.mycompany.apiservicios.logica.Cliente;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-12-01T01:58:02", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Servicio.class)
public class Servicio_ { 

    public static volatile SingularAttribute<Servicio, String> nombreServicio;
    public static volatile SingularAttribute<Servicio, String> descripcion;
    public static volatile SingularAttribute<Servicio, Cliente> cliente;
    public static volatile SingularAttribute<Servicio, String> sistemaOperativo;
    public static volatile SingularAttribute<Servicio, Integer> id;

}