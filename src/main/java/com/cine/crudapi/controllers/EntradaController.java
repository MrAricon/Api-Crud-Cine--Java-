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
@RequestMapping("/api/entradas")
public class EntradaController {
    @Autowired
    private EntradaRepository entradaRepository;
    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping
    public List<EntradaModel> getAll() { return entradaRepository.findAll(); }
    @GetMapping("/{id}")
    public Optional<EntradaModel> getById(@PathVariable int id) { return entradaRepository.findById(id); }
    @PostMapping
    public EntradaModel create(@RequestBody EntradaModel entrada) { return entradaRepository.save(entrada); }
    @PutMapping("/{id}")
    public EntradaModel update(@PathVariable int id, @RequestBody EntradaModel entrada) {
        entrada.setId(id);
        return entradaRepository.save(entrada);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) { entradaRepository.deleteById(id); }
}
