package com.estoic.api.interfaces;

import com.estoic.api.dtos.PensadorDto.ObraDto.ObraRequest;
import com.estoic.api.dtos.PensadorDto.ObraDto.ObraResponse;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface IObraCrud {
    void registerObra(ObraRequest obraRequest);

    Optional<ObraResponse> buscarObraPorTitulo(String titulo);

    Optional<ObraResponse> buscarPorAnoPublicacao(Date dataInicio, Date dataFinal);

    Optional<List<ObraResponse>> buscarObrasPorPensador(String nome);

    Optional<List<ObraResponse>> buscarObrasPorTema(String tema);
}
