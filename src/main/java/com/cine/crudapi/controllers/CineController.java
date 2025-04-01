package com.CineModel.crudapi.controllers;

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
@RequestMapping("/api/cines")
public class CineController {
    @Autowired
    private CineRepository cineRepository;
    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping
    public List<CineModel> getAll() { return cineRepository.findAll(); }

    @GetMapping("/{id}")
    public Optional<CineModel> getById(@PathVariable int id) { return cineRepository.findById(id); }

    @PostMapping
    public CineModel create(@RequestBody CineModel cine) { return cineRepository.save(cine); }

    @PutMapping("/{id}")
    public CineModel update(@PathVariable int id, @RequestBody CineModel cine) {
        cine.setId(id);
        return cineRepository.save(cine);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) { cineRepository.deleteById(id); }
}
