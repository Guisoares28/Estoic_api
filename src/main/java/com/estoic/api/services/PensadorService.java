package com.estoic.api.services;

import com.estoic.api.dtos.PensadorDto.PensadorRequest;
import com.estoic.api.dtos.PensadorDto.PensadorResponse;
import com.estoic.api.interfaces.IPensadorConversor;
import com.estoic.api.interfaces.IPensadorCrud;
import com.estoic.api.models.PensadorModel;
import com.estoic.api.repositories.PensadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PensadorService implements IPensadorCrud {

    @Autowired
    private IPensadorConversor PConversor;

    @Autowired
    private PensadorRepository pensadorRepository;

    @Override
    public void registrarPensador(PensadorRequest pensadorRequest) {
        PensadorModel pensador = PConversor.converterRequestParaModel(pensadorRequest);
        pensadorRepository.save(pensador);
    }

    @Override
    public PensadorResponse recuperarPensadorPorNome(String nome) {
        PensadorModel pensadorEncontrado = pensadorRepository.findByNomeIgnoreCase(nome)
                .orElseThrow(() -> new RuntimeException("Não foi encontrado nenhum Pensador com este nome"));
        return PConversor.converterModelParaResponse(pensadorEncontrado);
    }

    @Override
    public List<PensadorResponse> recuperarTodosOsPensadores() {
        List<PensadorModel> pensadoresModels = pensadorRepository.findAll();
        return PConversor.converterModelParaResponse(pensadoresModels);
    }

    @Override
    public List<PensadorResponse> recuperarPensadoresPorAnoNascimento(Integer ano_nascimento) {
        List<PensadorModel> pensadoresModels = pensadorRepository.findByAnoNascimento(ano_nascimento)
                .orElseThrow(() -> new RuntimeException("Nenhum pensador encontrado com está data"));
        return PConversor.converterModelParaResponse(pensadoresModels);
    }

    @Override
    public List<PensadorResponse> recuperarPensadoresPorAnoDaMorte(Integer ano_morte) {
        List<PensadorModel> pensadoresModels = pensadorRepository.findByAnoMorte(ano_morte)
                .orElseThrow(() -> new RuntimeException("Nenhum pensador encontrado com está data"));
        return PConversor.converterModelParaResponse(pensadoresModels);
    }

    @Override
    public List<PensadorResponse> recuperarPensadoresPorLocalNascimento(String local_nascimento) {
        return null;
    }

    @Override
    public List<PensadorResponse> recuperarPensadorPorObra(String nome_obra) {
        return null;
    }
}
