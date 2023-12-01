package com.mycompany.apiservicios.logica;

import com.mycompany.apiservicios.logica.Cliente;
import com.mycompany.apiservicios.logica.Incidente;
import com.mycompany.apiservicios.logica.Tecnico;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-12-01T01:53:25", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Reclamo.class)
public class Reclamo_ { 

    public static volatile ListAttribute<Reclamo, Incidente> incidentes;
    public static volatile SingularAttribute<Reclamo, Cliente> cliente;
    public static volatile SingularAttribute<Reclamo, String> consideraciones;
    public static volatile SingularAttribute<Reclamo, Integer> id;
    public static volatile SingularAttribute<Reclamo, Tecnico> tecnico;

}