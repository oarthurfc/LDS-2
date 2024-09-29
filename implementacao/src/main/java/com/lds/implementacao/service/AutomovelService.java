package com.lds.implementacao.service;

import com.lds.implementacao.model.Automovel;
import com.lds.implementacao.repository.AutomovelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutomovelService {

    @Autowired
    private AutomovelRepository automovelRepository;

    public Automovel criarAutomovel(Automovel automovel) {
        return automovelRepository.save(automovel);
    }

    public List<Automovel> listarAutomoveis() {
        return automovelRepository.findAll();
    }

    public Automovel obterAutomovelPorId(Long id) {
        return automovelRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Automóvel não encontrado"));
    }

    public Automovel atualizarAutomovel(Long id, Automovel automovelAtualizado) {
        Automovel automovel = obterAutomovelPorId(id);
        automovel.setMatricula(automovelAtualizado.getMatricula());
        automovel.setPlaca(automovelAtualizado.getPlaca());
        automovel.setMarca(automovelAtualizado.getMarca());
        automovel.setModelo(automovelAtualizado.getModelo());
        automovel.setAno(automovelAtualizado.getAno());
        return automovelRepository.save(automovel);
    }

    public void deletarAutomovel(Long id) {
        Automovel automovel = obterAutomovelPorId(id);
        automovelRepository.delete(automovel);
    }
}
