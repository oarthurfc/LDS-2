package com.lds.implementacao.service;

import org.springframework.stereotype.Service;

import com.lds.implementacao.model.Agente;
import com.lds.implementacao.model.Cliente;
import com.lds.implementacao.repository.AgenteRepository;

import io.micrometer.common.lang.NonNull;
import jakarta.transaction.Transactional;

@Service
public class AgenteService {
    AgenteRepository agenteRepository;

    @Transactional
    public Agente create(@NonNull Agente agente){
        return this.agenteRepository.save(agente);
    }
}
