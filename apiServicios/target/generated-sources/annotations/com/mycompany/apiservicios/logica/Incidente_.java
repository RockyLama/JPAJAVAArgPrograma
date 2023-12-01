package com.mycompany.apiservicios.logica;

import com.mycompany.apiservicios.logica.Problema;
import com.mycompany.apiservicios.logica.Reclamo;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-12-01T01:35:17", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Incidente.class)
public class Incidente_ { 

    public static volatile SingularAttribute<Incidente, Reclamo> reclamo;
    public static volatile SingularAttribute<Incidente, Problema> problema;
    public static volatile SingularAttribute<Incidente, Integer> id;
    public static volatile SingularAttribute<Incidente, Boolean> resuelto;

}