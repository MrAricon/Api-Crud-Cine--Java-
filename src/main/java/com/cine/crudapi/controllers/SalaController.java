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
@RequestMapping("/api/salas")
public class SalaController {
    @Autowired
    private SalaRepository salaRepository;
    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping
    public List<SalaModel> getAll() { return salaRepository.findAll(); }
    @GetMapping("/{id}")
    public Optional<SalaModel> getById(@PathVariable int id) { return salaRepository.findById(id); }
    @PostMapping
    public SalaModel create(@RequestBody SalaModel sala) { return salaRepository.save(sala); }
    @PutMapping("/{id}")
    public SalaModel update(@PathVariable int id, @RequestBody SalaModel sala) {
        sala.setId(id);
        return salaRepository.save(sala);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) { salaRepository.deleteById(id); }
}
