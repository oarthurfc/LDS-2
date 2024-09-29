package com.lds.implementacao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lds.implementacao.enums.StatusPedido;
import com.lds.implementacao.model.Cliente;
import com.lds.implementacao.model.Pedido;
import com.lds.implementacao.repository.ClienteRepository;
import com.lds.implementacao.repository.PedidoRepository;

import java.util.List;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Transactional
    public Pedido criarPedido(Long clienteId, Pedido novoPedido) {
        Cliente cliente = clienteRepository.findById(clienteId)
            .orElseThrow(() -> new RuntimeException("Cliente não encontrado"));

        novoPedido.setCliente(cliente);
        novoPedido.setStatus(StatusPedido.ANALISE); // Status inicial

        return pedidoRepository.save(novoPedido);
    }

    public List<Pedido> listarPedidosPorCliente(Long clienteId) {
        return pedidoRepository.findByClienteId(clienteId);
    }

    public Pedido obterPedidoPorId(Long pedidoId) {
        return pedidoRepository.findById(pedidoId)
            .orElseThrow(() -> new RuntimeException("Pedido não encontrado"));
    }
}
