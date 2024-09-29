package com.lds.implementacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lds.implementacao.model.Agente;

@Repository
public interface AgenteRepository extends JpaRepository<Agente, Long> {
    
}
