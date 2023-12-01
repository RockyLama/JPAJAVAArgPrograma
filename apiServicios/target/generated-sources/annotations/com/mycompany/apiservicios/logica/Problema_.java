package com.mycompany.apiservicios.logica;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-12-01T01:35:27", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Problema.class)
public class Problema_ { 

    public static volatile SingularAttribute<Problema, String> tipoDeProblema;
    public static volatile SingularAttribute<Problema, String> descripcionDelProblema;
    public static volatile SingularAttribute<Problema, Double> tiempoDeResolucion;
    public static volatile SingularAttribute<Problema, Integer> id;

}