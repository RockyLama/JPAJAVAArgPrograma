package com.mycompany.apiservicios.persistencia;


import com.mycompany.apiservicios.logica.Tecnico;
import com.mycompany.apiservicios.repo.TecnicoRepository;
import com.mycompany.apiservicios.repo.implement.TecnicoImplRepository;
import com.mycompany.apiservicios.service.TecnicoService;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;


public class ControladoraPersistencia {
    private final TecnicoService tecnicoService;

   public ClienteJpaController aluJpa = new ClienteJpaController();
    public IncidenteJpaController inciJpa = new IncidenteJpaController();
    public ProblemaJpaController problJpa = new ProblemaJpaController();
    public ReclamoJpaController reclJpa = new ReclamoJpaController();
    public ServicioJpaController servJpa = new ServicioJpaController();
    public TecnicoJpaController tecnJpa = new TecnicoJpaController();

    public ControladoraPersistencia(EntityManagerFactory emf) {
        EntityManager em = emf.createEntityManager();
        EntityManager entityManager = emf.createEntityManager();
        TecnicoRepository tecnicoRepository = new TecnicoImplRepository(entityManager);
        this.tecnicoService = new TecnicoService(tecnicoRepository);
        this.aluJpa = new ClienteJpaController(emf);
        this.inciJpa = new IncidenteJpaController(emf);
        this.problJpa = new ProblemaJpaController(emf);
        this.reclJpa = new ReclamoJpaController(emf);
        this.servJpa = new ServicioJpaController(emf);
        this.tecnJpa = new TecnicoJpaController(emf);
    }
    public List<Tecnico> obtenerTodosTecnicos() {
        return tecnicoService.obtenerTodosTecnicos();
    }
    public Tecnico obtenerTecnicoConMasIncidentesResueltos(List<Tecnico> tecnicos, int ultimosDias) {
        return tecnicoService.obtenerTecnicoConMasIncidentesResueltos(tecnicos, ultimosDias);
    }

    public Tecnico obtenerTecnicoMasRapido(List<Tecnico> tecnicos) {
        return tecnicoService.obtenerTecnicoMasRapido(tecnicos);
    }

    public Tecnico obtenerTecnicoConMasIncidentesPorEspecialidad(List<Tecnico> tecnicos, String especialidad, int ultimosDias) {
        return tecnicoService.obtenerTecnicoConMasIncidentesPorEspecialidad(tecnicos, especialidad, ultimosDias);
    }

}
