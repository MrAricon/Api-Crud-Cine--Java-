package com.cine.crudapi.controllers;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;
import com.cine.crudapi.models.*;
import com.cine.crudapi.repositories.*;

/**
 *
 * @author paucanmil
 */
@RestController
@RequestMapping("/api/sesiones")
public class SesionController {
    @Autowired
    private SesionRepository sesionRepository;
    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping
    public List<SesionModel> getAll() { return sesionRepository.findAll(); }
    @GetMapping("/peliculas/{peliculaId}")
    public List<SesionModel> getByPeliculaId(@PathVariable int peliculaId) {
        return sesionRepository.findByPeliculaId(peliculaId);
    }
    @GetMapping("/{id}")
    public Optional<SesionModel> getById(@PathVariable int id) { return sesionRepository.findById(id); }
    @PostMapping
    public SesionModel create(@RequestBody SesionModel sesion) { return sesionRepository.save(sesion); }
    @PutMapping("/{id}")
    public SesionModel update(@PathVariable int id, @RequestBody SesionModel sesion) {
        sesion.setId(id);
        return sesionRepository.save(sesion);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) { sesionRepository.deleteById(id); }
}
