package com.estoic.api.services;

import com.estoic.api.dtos.PensadorDto.PensadorRequest;
import com.estoic.api.dtos.PensadorDto.PensadorResponse;
import com.estoic.api.interfaces.IPensadorConversor;
import com.estoic.api.interfaces.IPensadorCrud;
import com.estoic.api.models.PensadorModel;
import com.estoic.api.repositories.PensadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

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
    public Optional<PensadorResponse> recuperarPensadorPorNome(String nome) {
        return Optional.empty();
    }

    @Override
    public Optional<List<PensadorResponse>> recuperarTodosOsPensadores() {
        return Optional.empty();
    }

    @Override
    public Optional<List<PensadorResponse>> recuperarPensadoresPorAnoNascimento(Integer ano_nascimento) {
        return Optional.empty();
    }

    @Override
    public Optional<List<PensadorResponse>> recuperarPensadoresPorAnoDaMorte(Integer ano_morte) {
        return Optional.empty();
    }

    @Override
    public Optional<List<PensadorResponse>> recuperarPensadoresPorLocalNascimento(String local_nascimento) {
        return Optional.empty();
    }

    @Override
    public Optional<List<PensadorResponse>> recuperarPensadorPorObra(String nome_obra) {
        return Optional.empty();
    }
}
