package com.mycompany.apiservicios.logica;

import com.mycompany.apiservicios.logica.Reclamo;
import java.util.List;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-12-01T01:48:12", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Tecnico.class)
public class Tecnico_ { 

    public static volatile SingularAttribute<Tecnico, List> especialidades;
    public static volatile ListAttribute<Tecnico, Reclamo> reclamos;
    public static volatile SingularAttribute<Tecnico, Integer> id;
    public static volatile SingularAttribute<Tecnico, String> medioDeNotificacion;
    public static volatile SingularAttribute<Tecnico, String> nombre;
    public static volatile SingularAttribute<Tecnico, List> resolucionDeProblemas;

}