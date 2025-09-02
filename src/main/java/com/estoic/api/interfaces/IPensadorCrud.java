package com.estoic.api.interfaces;

import com.estoic.api.dtos.PensadorDto.PensadorRequest;
import com.estoic.api.models.PensadorModel;

import java.util.Date;
import java.util.List;

public interface IPensadorCrud {
    void registrarPensador(PensadorRequest pensadorRequest);

    PensadorModel recuperarPensadorPeloId(Long id);

    PensadorModel recuperarPensadorPorNome(String nome);

    List<PensadorModel> recuperarTodosOsPensadores();

    List<PensadorModel> recuperarPensadoresPorDataNascimento(Date data_nascimento);

    List<PensadorModel> recuperarPensadoresPorDataMorte(Date data_morte);

    List<PensadorModel> recuperarPensadoresPorLocalNascimento(String local_nascimento);

    List<PensadorModel> recuperarPensadorPorObra(String nome_obra);
}
