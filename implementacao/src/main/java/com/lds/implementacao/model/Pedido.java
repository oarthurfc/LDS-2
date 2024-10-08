package com.lds.implementacao.model;

import java.util.Date;

import com.lds.implementacao.enums.StatusPedido;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Enumerated(EnumType.STRING)
    StatusPedido status;

    Date data;

    @ManyToOne 
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @OneToOne(cascade = CascadeType.ALL, optional = true)
    Contrato contrato;

    @ManyToOne
    @JoinColumn(name = "agente_id")  
    Agente agente;
}
