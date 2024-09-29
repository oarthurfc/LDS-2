package com.lds.implementacao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lds.implementacao.model.Agente;
import com.lds.implementacao.repository.AgenteRepository;

@RestController
@RequestMapping("/agentes")
public class AgenteController {
    @Autowired
    AgenteRepository agenteService;

    @PostMapping
    public ResponseEntity<Agente> create(@RequestBody Agente agente) {
        Agente newAgente = agenteService.save(agente);
        return ResponseEntity.ok(newAgente);
    }
}
