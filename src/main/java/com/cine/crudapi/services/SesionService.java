package com.cine.crudapi.services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cine.crudapi.repositories.*;
import com.cine.crudapi.models.*;

/**
 *
 * @author paucanmil
 */
@Service
public class SesionService {
    @Autowired
    private SesionRepository sesionRepository;
}