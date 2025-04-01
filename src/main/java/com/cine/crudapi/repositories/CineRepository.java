package com.cine.crudapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cine.crudapi.models.*;

/**
 *
 * @author paucanmil
 */
public interface CineRepository extends JpaRepository<CineModel, Integer> {
    
}
