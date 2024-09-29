package com.lds.implementacao.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Cliente extends Proprietario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nome;
    String endereco;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL) // Relacionamento com Pedido
    List<Pedido> pedidos;

    String cpf;
    String rg;
    String profissao;
    
    @ElementCollection
    List<String> empregadores;
    Double salarioTotal;
}
