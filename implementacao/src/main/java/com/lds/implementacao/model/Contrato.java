package com.lds.implementacao.model;

import com.lds.implementacao.enums.TempoDeContrato;

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

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Contrato {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @OneToOne
    @JoinColumn(name = "pedido_id", referencedColumnName = "id")
    Pedido pedido;

    @ManyToOne
    @JoinColumn(name = "agente_id")
    Agente agente;
    
    @Enumerated(EnumType.STRING)
    TempoDeContrato tempoDeContrato;

    Boolean optouPelaCompra;

    @ManyToOne
    @JoinColumn(name = "automovel_id")
    Automovel automovel;
}
