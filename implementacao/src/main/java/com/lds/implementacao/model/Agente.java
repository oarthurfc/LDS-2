package com.lds.implementacao.model;

import java.util.List;

import org.hibernate.mapping.OneToOne;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.OneToMany;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@Inheritance(strategy = InheritanceType.JOINED)
public class Agente extends Proprietario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nome;
    String CNPJ;
    String endereco;
    
    @OneToMany(mappedBy = "agente", cascade = CascadeType.ALL)
    List<Contrato> contratos;
    
    @OneToMany(mappedBy = "agente", cascade = CascadeType.ALL)
    List<Pedido> pedidos;
}
