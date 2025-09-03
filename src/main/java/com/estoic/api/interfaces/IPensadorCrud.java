package com.estoic.api.interfaces;

import com.estoic.api.dtos.PensadorDto.PensadorRequest;
import com.estoic.api.dtos.PensadorDto.PensadorResponse;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface IPensadorCrud {
    void registrarPensador(PensadorRequest pensadorRequest);

    Optional<PensadorResponse> recuperarPensadorPorNome(String nome);

    Optional<List<PensadorResponse>> recuperarTodosOsPensadores();

    Optional<List<PensadorResponse>> recuperarPensadoresPorAnoNascimento(Integer ano_nascimento);

    Optional<List<PensadorResponse>> recuperarPensadoresPorAnoDaMorte(Integer ano_morte);

    Optional<List<PensadorResponse>> recuperarPensadoresPorLocalNascimento(String local_nascimento);

    Optional<List<PensadorResponse>> recuperarPensadorPorObra(String nome_obra);
}
