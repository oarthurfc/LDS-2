package com.lds.implementacao.repository;

import com.lds.implementacao.model.Automovel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutomovelRepository extends JpaRepository<Automovel, Long> {
    // Aqui você pode adicionar métodos de consulta personalizados se necessário
}
