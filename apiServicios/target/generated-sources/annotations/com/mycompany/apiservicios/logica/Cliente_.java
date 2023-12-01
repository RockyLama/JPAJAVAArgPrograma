package com.mycompany.apiservicios.logica;

import com.mycompany.apiservicios.logica.Reclamo;
import com.mycompany.apiservicios.logica.Servicio;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-12-01T01:56:30", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile ListAttribute<Cliente, Servicio> servicios;
    public static volatile SingularAttribute<Cliente, String> razonSocial;
    public static volatile SingularAttribute<Cliente, String> cuit;
    public static volatile SingularAttribute<Cliente, String> mail;
    public static volatile ListAttribute<Cliente, Reclamo> reclamos;

}