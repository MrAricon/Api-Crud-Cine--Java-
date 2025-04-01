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
@RequestMapping("/api/peliculas")
public class PeliculaController {
    @Autowired
    private PeliculaRepository peliculaRepository;
    
    @GetMapping
    public List<PeliculaModel> getAll() { return peliculaRepository.findAll(); }
    @GetMapping("/{id}")
    public Optional<PeliculaModel> getById(@PathVariable int id) { return peliculaRepository.findById(id); }
    @PostMapping
    public PeliculaModel create(@RequestBody PeliculaModel pelicula) { return peliculaRepository.save(pelicula); }
    @PutMapping("/{id}")
    public PeliculaModel update(@PathVariable int id, @RequestBody PeliculaModel pelicula) {
        pelicula.setId(id);
        return peliculaRepository.save(pelicula);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) { peliculaRepository.deleteById(id); }
}
