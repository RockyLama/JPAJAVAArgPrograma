package com.mycompany.apiservicios.repo.implement;

import com.mycompany.apiservicios.logica.Tecnico;
import com.mycompany.apiservicios.repo.TecnicoRepository;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class TecnicoImplRepository implements TecnicoRepository {
    private final EntityManager entityManager;

    public TecnicoImplRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void create(Tecnico tecnico) {
        entityManager.getTransaction().begin();
        entityManager.persist(tecnico);
        entityManager.getTransaction().commit();
    }

    @Override
    public Tecnico findById(int id) {
        return entityManager.find(Tecnico.class, id);
    }

    @Override
    public List<Tecnico> findAll() {
        TypedQuery<Tecnico> query = entityManager.createQuery("SELECT t FROM Tecnico t", Tecnico.class);
        return query.getResultList();
    }
}
