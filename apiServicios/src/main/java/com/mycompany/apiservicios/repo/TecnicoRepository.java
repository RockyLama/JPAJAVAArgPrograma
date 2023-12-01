package com.mycompany.apiservicios.repo;

import com.mycompany.apiservicios.logica.Tecnico;

import java.util.List;

public interface TecnicoRepository {
    void create(Tecnico tecnico);
    Tecnico findById(int id);
    List<Tecnico> findAll();
}
