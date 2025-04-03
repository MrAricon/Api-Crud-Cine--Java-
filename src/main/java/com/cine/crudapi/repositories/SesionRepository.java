package com.cine.crudapi.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cine.crudapi.models.*;

/**
 *
 * @author paucanmil
 */
public interface SesionRepository extends JpaRepository<SesionModel, Integer> {
     List<SesionModel> findByPeliculaId(int peliculaId); 
}
