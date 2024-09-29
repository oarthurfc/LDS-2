package com.lds.implementacao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.lds.implementacao.model.Pedido;
import com.lds.implementacao.service.PedidoService;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    // Criar um novo pedido
    @PostMapping("/cliente/{clienteId}")
    public ResponseEntity<Pedido> criarPedido(@PathVariable Long clienteId, @RequestBody Pedido pedido) {
        Pedido novoPedido = pedidoService.criarPedido(clienteId, pedido);
        return ResponseEntity.ok(novoPedido);
    }

    // Listar pedidos de um cliente
    @GetMapping("/cliente/{clienteId}")
    public ResponseEntity<List<Pedido>> listarPedidosPorCliente(@PathVariable Long clienteId) {
        List<Pedido> pedidos = pedidoService.listarPedidosPorCliente(clienteId);
        return ResponseEntity.ok(pedidos);
    }

    // Obter detalhes de um pedido específico
    @GetMapping("/{pedidoId}")
    public ResponseEntity<Pedido> obterPedidoPorId(@PathVariable Long pedidoId) {
        Pedido pedido = pedidoService.obterPedidoPorId(pedidoId);
        return ResponseEntity.ok(pedido);
    }
}

