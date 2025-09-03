package com.estoic.api.interfaces;

import com.estoic.api.dtos.PensadorDto.PensadorRequest;
import com.estoic.api.dtos.PensadorDto.PensadorResponse;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface IPensadorCrud {
    void registrarPensador(PensadorRequest pensadorRequest);

    PensadorResponse recuperarPensadorPorNome(String nome);

    List<PensadorResponse> recuperarTodosOsPensadores();

    List<PensadorResponse> recuperarPensadoresPorAnoNascimento(Integer ano_nascimento);

    List<PensadorResponse> recuperarPensadoresPorAnoDaMorte(Integer ano_morte);

    List<PensadorResponse> recuperarPensadoresPorLocalNascimento(String local_nascimento);

    List<PensadorResponse> recuperarPensadorPorObra(String nome_obra);
}
