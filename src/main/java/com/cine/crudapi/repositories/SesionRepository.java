package com.cine.crudapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cine.crudapi.models.*;

/**
 *
 * @author paucanmil
 */
public interface SesionRepository extends JpaRepository<SesionModel, Integer> {
    
}
