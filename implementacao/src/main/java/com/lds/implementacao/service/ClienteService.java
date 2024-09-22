package com.lds.implementacao.service;

import java.util.List;
import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lds.implementacao.model.Cliente;
import com.lds.implementacao.repository.ClienteRepository;

import io.micrometer.common.lang.NonNull;
import jakarta.transaction.Transactional;

@Service
public class ClienteService {
    @Autowired
    ClienteRepository clienteRepository;

    @Transactional
    public Cliente create(@NonNull Cliente cliente){
        return this.clienteRepository.save(cliente);
    }

    public Cliente findById(@NonNull Long id){
        Optional<Cliente> cliente = this.clienteRepository.findById(id);
        return cliente.orElseThrow(() -> new ObjectNotFoundException("Cliente não encontrado", id));
    }

    public List<Cliente> findAll(){
        List<Cliente> clientes = this.clienteRepository.findAll();
        return clientes;
    }

    @Transactional
    public Cliente update(@NonNull Cliente cliente){
        Cliente clienteExistente = findById(cliente.getId());

        clienteExistente.setNome(cliente.getNome());
        clienteExistente.setEndereco(cliente.getEndereco());
        clienteExistente.setPedidos(cliente.getPedidos());
        clienteExistente.setCpf(cliente.getCpf());
        clienteExistente.setRg(cliente.getRg());
        clienteExistente.setProfissao(cliente.getProfissao());
        clienteExistente.setEmpregadores(cliente.getEmpregadores());
        clienteExistente.setSalarioTotal(cliente.getSalarioTotal());

        return clienteRepository.save(clienteExistente);
    }

    @Transactional
    public void delete (@NonNull Long id){
        Cliente cliente = findById(id);
        clienteRepository.delete(cliente);
    }

}
