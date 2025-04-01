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
@RequestMapping("/api/butacas")
public class ButacaController {
    @Autowired
    private ButacaRepository butacaRepository;
    
    @GetMapping
    public List<ButacaModel> getAll() { return butacaRepository.findAll(); }
    @GetMapping("/{id}")
    public Optional<ButacaModel> getById(@PathVariable int id) { return butacaRepository.findById(id); }
    @PostMapping
    public ButacaModel create(@RequestBody ButacaModel butaca) { return butacaRepository.save(butaca); }
    @PutMapping("/{id}")
    public ButacaModel update(@PathVariable int id, @RequestBody ButacaModel butaca) {
        butaca.setId(id);
        return butacaRepository.save(butaca);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) { butacaRepository.deleteById(id); }
}
