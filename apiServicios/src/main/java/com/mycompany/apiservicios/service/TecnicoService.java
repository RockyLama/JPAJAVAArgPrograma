package com.mycompany.apiservicios.service;

import com.mycompany.apiservicios.logica.Tecnico;
import com.mycompany.apiservicios.repo.TecnicoRepository;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TecnicoService {
    private final TecnicoRepository tecnicoRepository;

    public TecnicoService(TecnicoRepository tecnicoRepository) {
        this.tecnicoRepository = tecnicoRepository;
    }

    public void crearTecnico(Tecnico tecnico) {
        tecnicoRepository.create(tecnico);
    }

    public Tecnico obtenerTecnicoPorId(int id) {
        return tecnicoRepository.findById(id);
    }

    public List<Tecnico> obtenerTodosTecnicos() {
        return tecnicoRepository.findAll();
    }

    public Tecnico obtenerTecnicoConMasIncidentesResueltos(List<Tecnico> tecnicos, int ultimosDias) {
        return tecnicos.stream()
                .max(Comparator.comparingInt(tecnico -> cantidadIncidentesResueltosEnUltimosDias(tecnico, ultimosDias)))
                .orElse(null);
    }

    public Tecnico obtenerTecnicoMasRapido(List<Tecnico> tecnicos) {
        return tecnicos.stream()
                .min(Comparator.comparingDouble(this::tiempoPromedioResolucion))
                .orElse(null);
    }


    public Tecnico obtenerTecnicoConMasIncidentesPorEspecialidad(List<Tecnico> tecnicos, String especialidad, int ultimosDias) {
        Predicate<Tecnico> porEspecialidad = tecnico -> tecnico.getEspecialidades().contains(especialidad);

        List<Tecnico> filtrados = tecnicos.stream()
                .filter(porEspecialidad)
                .collect(Collectors.toList());

        System.out.println("Técnicos con especialidad " + especialidad + ": " + filtrados);

        return filtrados.stream()
                .max(Comparator.comparingInt(tecnico -> cantidadIncidentesResueltosEnUltimosDias(tecnico, ultimosDias)))
                .orElse(null);
    }


    private int cantidadIncidentesResueltosEnUltimosDias(Tecnico tecnico, int ultimosDias) {
        return tecnico.getReclamos().stream()
                .flatMap(r -> r.getIncidentes().stream())
                .filter(i -> {
                    double tiempoResolucion = i.getProblema().getTiempoDeResolucion();
                    System.out.println("Tiempo de resolución(dias): " + tiempoResolucion);
                    return tiempoResolucion > 0 && tiempoResolucion <= ultimosDias;
                })
                .mapToInt(incidente -> 1)
                .sum();
    }

    private double tiempoPromedioResolucion(Tecnico tecnico) {
        return tecnico.getReclamos().stream()
                .flatMap(r -> r.getIncidentes().stream())
                .mapToDouble(i -> {
                    double tiempoResolucion = i.getProblema().getTiempoDeResolucion();
                    System.out.println("Tiempo de resolución: " + tiempoResolucion);
                    return tiempoResolucion;
                })
                .filter(tiempo -> tiempo != Double.MAX_VALUE)
                .average()
                .orElse(Double.NaN); // Puedes cambiar esto según lo que desees retornar en caso de no haber valores
    }

}