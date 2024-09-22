package com.lds.implementacao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lds.implementacao.service.ClienteService;

import io.swagger.v3.oas.annotations.Operation;

import com.lds.implementacao.model.Cliente;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    ClienteService clienteService;

    @Operation(summary = "Cria um Cliente", description = "Cria um Cliente")
    @PostMapping
    public ResponseEntity<Cliente> create(@RequestBody Cliente cliente) {
        Cliente newCliente = clienteService.create(cliente);
        return ResponseEntity.ok(newCliente);
    }
    

    @Operation(summary = "Busca cliente pelo id", description = "Busca cliente pelo id")
    @GetMapping("/{id}")
    public ResponseEntity<Cliente> findById(@PathVariable Long id) {
        Cliente cliente = clienteService.findById(id);
        return ResponseEntity.ok(cliente);
    }

    @Operation(summary = "Busca todos os clientes", description = "Busca todos os clientes")
    @GetMapping
    public ResponseEntity<List<Cliente>> findAll(){
        List<Cliente> clientes = clienteService.findAll();
        return ResponseEntity.ok(clientes);
    }

    @Operation(summary = "Atualiza um cliente", description = "Atualiza um cliente")
    @PutMapping("/{id}")
    public ResponseEntity<Cliente> update(@PathVariable Long id, @RequestBody Cliente cliente) {
        cliente.setId(id);
        Cliente updateCliente = clienteService.update(cliente);
        return ResponseEntity.ok(updateCliente);
    }

    @Operation(summary = "Deleta um cliente", description = "Deleta um cliente")
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        clienteService.delete(id);
        return ResponseEntity.noContent().build();
    }
    
}
