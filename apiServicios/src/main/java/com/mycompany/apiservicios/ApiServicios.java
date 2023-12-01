package com.mycompany.apiservicios;

import com.mycompany.apiservicios.logica.*;
import com.mycompany.apiservicios.persistencia.ControladoraPersistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class ApiServicios {

    public static void cargarDatos(EntityManager entityManager) {
       // Obtener técnicos existentes de la base de datos
        Tecnico tecnico1 = entityManager.find(Tecnico.class, 53);
        Tecnico tecnico2 = entityManager.find(Tecnico.class, 103);
        Tecnico tecnico3 = entityManager.find(Tecnico.class, 52);

        // Crear nuevos problemas
        Problema problema1 = new Problema();
        problema1.setDescripcionDelProblema("Problema de hardware");
        problema1.setTipoDeProblema("Hardware");
        problema1.setTiempoDeResolucion(2.0);

        Problema problema2 = new Problema();
        problema2.setDescripcionDelProblema("Problema de red");
        problema2.setTipoDeProblema("Red");
        problema2.setTiempoDeResolucion(3.0);

        // Crear nuevos reclamos
        Reclamo reclamo1 = new Reclamo();
        reclamo1.setCliente(entityManager.find(Cliente.class, "99999999"));
        reclamo1.setConsideraciones("Buen servicio");
        reclamo1.setTecnico(tecnico1);

        Reclamo reclamo2 = new Reclamo();
        reclamo2.setCliente(entityManager.find(Cliente.class, "8888888888"));
        reclamo2.setConsideraciones("Rápida resolución");
        reclamo2.setTecnico(tecnico2);

        Reclamo reclamo3 = new Reclamo();
        reclamo3.setCliente(entityManager.find(Cliente.class, "77777777"));
        reclamo3.setConsideraciones("Atención especializada");
        reclamo3.setTecnico(tecnico3);

        // Crear nuevos incidentes
        Incidente incidente1 = new Incidente();
        incidente1.setProblema(problema1);
        incidente1.setResuelto(true);
        incidente1.setReclamo(reclamo1);

        Incidente incidente2 = new Incidente();
        incidente2.setProblema(problema2);
        incidente2.setResuelto(true);
        incidente2.setReclamo(reclamo1);

        Incidente incidente3 = new Incidente();
        incidente3.setProblema(problema1);
        incidente3.setResuelto(true);
        incidente3.setReclamo(reclamo2);

        Incidente incidente4 = new Incidente();
        incidente4.setProblema(problema2);
        incidente4.setResuelto(true);
        incidente4.setReclamo(reclamo2);

        Incidente incidente5 = new Incidente();
        incidente5.setProblema(problema1);
        incidente5.setResuelto(true);
        incidente5.setReclamo(reclamo3);

        Incidente incidente6 = new Incidente();
        incidente6.setProblema(problema2);
        incidente6.setResuelto(true);
        incidente6.setReclamo(reclamo3);

        // Establecer la relación entre incidentes y reclamos (uno a uno)
        reclamo1.setIncidentes(List.of(incidente1, incidente2));
        reclamo2.setIncidentes(List.of(incidente3, incidente4));
        reclamo3.setIncidentes(List.of(incidente5, incidente6));


        // Actualizar la base de datos con los nuevos incidentes y reclamos
        entityManager.getTransaction().begin();
        entityManager.persist(tecnico1);
        entityManager.persist(tecnico2);
        entityManager.persist(tecnico3);
        entityManager.persist(problema1);
        entityManager.persist(problema2);
        entityManager.persist(reclamo1);
        entityManager.persist(reclamo2);
        entityManager.persist(reclamo3);
        entityManager.persist(incidente1);
        entityManager.persist(incidente2);
        entityManager.persist(incidente3);
        entityManager.persist(incidente4);
        entityManager.persist(incidente5);
        entityManager.persist(incidente6);
        entityManager.getTransaction().commit();

        // Recargar técnicos después de la transacción
        tecnico1 = entityManager.find(Tecnico.class, 53);
        tecnico2 = entityManager.find(Tecnico.class, 103);
        tecnico3 = entityManager.find(Tecnico.class, 52);
    }

    public static void main(String[] args) {
        // Crear el EntityManagerFactory y el EntityManager
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("apiServiciosPU");
        EntityManager em = emf.createEntityManager();

        // Cargar datos iniciales
        cargarDatos(em);

        // Inicializar ControladoraPersistencia
        ControladoraPersistencia controladoraPersistencia = new ControladoraPersistencia(emf);

        // Obtener la lista de técnicos
        List<Tecnico> tecnicos = controladoraPersistencia.obtenerTodosTecnicos();

        // Definir el número de últimos días y la especialidad
        int ultimosDias = 7; // Modifica según tus necesidades
        String especialidad = "Redes"; // Modifica según tus necesidades

        // Obtener el técnico con más incidentes resueltos
        Tecnico tecnicoConMasIncidentes = controladoraPersistencia.obtenerTecnicoConMasIncidentesResueltos(tecnicos, ultimosDias);

        // Obtener el técnico más rápido
        Tecnico tecnicoMasRapido = controladoraPersistencia.obtenerTecnicoMasRapido(tecnicos);

        // Obtener el técnico con más incidentes por especialidad
        Tecnico tecnicoPorEspecialidad = controladoraPersistencia.obtenerTecnicoConMasIncidentesPorEspecialidad(tecnicos, especialidad, ultimosDias);

        // Imprimir los resultados
        if (tecnicoConMasIncidentes != null) {
            System.out.println("Técnico con más incidentes resueltos: " + tecnicoConMasIncidentes.getNombre());
        } else {
            System.out.println("No hay técnico con más incidentes resueltos.");
        }

        if (tecnicoMasRapido != null) {
            System.out.println("Técnico más rápido: " + tecnicoMasRapido.getNombre());
        } else {
            System.out.println("No hay técnico más rápido.");
        }

        if (tecnicoPorEspecialidad != null) {
            System.out.println("Técnico con más incidentes por especialidad: " + tecnicoPorEspecialidad.getNombre());
        } else {
            System.out.println("No hay técnico con más incidentes por especialidad.");
        }

        // Cerrar el EntityManager y EntityManagerFactory al finalizar
        em.close();
        emf.close();
    }
}
