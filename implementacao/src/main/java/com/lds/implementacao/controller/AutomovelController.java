package com.lds.implementacao.controller;

import com.lds.implementacao.model.Automovel;
import com.lds.implementacao.service.AutomovelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/automoveis")
public class AutomovelController {

    @Autowired
    private AutomovelService automovelService;

    // Criar um novo automóvel
    @PostMapping
    public ResponseEntity<Automovel> criarAutomovel(@RequestBody Automovel automovel) {
        Automovel novoAutomovel = automovelService.criarAutomovel(automovel);
        return ResponseEntity.ok(novoAutomovel);
    }

    // Listar todos os automóveis
    @GetMapping
    public ResponseEntity<List<Automovel>> listarAutomoveis() {
        List<Automovel> automoveis = automovelService.listarAutomoveis();
        return ResponseEntity.ok(automoveis);
    }

    // Obter detalhes de um automóvel específico
    @GetMapping("/{id}")
    public ResponseEntity<Automovel> obterAutomovelPorId(@PathVariable Long id) {
        Automovel automovel = automovelService.obterAutomovelPorId(id);
        return ResponseEntity.ok(automovel);
    }

    // Atualizar um automóvel existente
    @PutMapping("/{id}")
    public ResponseEntity<Automovel> atualizarAutomovel(@PathVariable Long id, @RequestBody Automovel automovel) {
        Automovel automovelAtualizado = automovelService.atualizarAutomovel(id, automovel);
        return ResponseEntity.ok(automovelAtualizado);
    }

    // Deletar um automóvel
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarAutomovel(@PathVariable Long id) {
        automovelService.deletarAutomovel(id);
        return ResponseEntity.noContent().build();
    }
}
