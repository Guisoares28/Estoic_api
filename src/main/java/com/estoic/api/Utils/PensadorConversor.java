package com.estoic.api.Utils;

import com.estoic.api.dtos.PensadorDto.PensadorRequest;
import com.estoic.api.dtos.PensadorDto.PensadorResponse;
import com.estoic.api.interfaces.IPensadorConversor;
import com.estoic.api.models.PensadorModel;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class PensadorConversor implements IPensadorConversor {

    @Override
    public PensadorModel converterRequestParaModel(PensadorRequest pensadorRequest) {
        return new PensadorModel(
                pensadorRequest.nome(),
                pensadorRequest.nome_completo(),
                pensadorRequest.ano_nascimento(),
                pensadorRequest.ano_morte(),
                pensadorRequest.local_nascimento(),
                pensadorRequest.biografia()
        );
    }

    @Override
    public PensadorResponse converterModelParaResponse(PensadorModel pensadorModel) {
        return new PensadorResponse(
                pensadorModel.getId(),
                pensadorModel.getNome(),
                pensadorModel.getNome_completo(),
                pensadorModel.getAnoNascimento(),
                pensadorModel.getAnoMorte(),
                pensadorModel.getLocalNascimento(),
                pensadorModel.getBiografia()
        );
    }

    @Override
    public LocalDate converterStringParaLocalDate(String data) {
        return null;
    }

    @Override
    public List<PensadorResponse> converterModelParaResponse(List<PensadorModel> pensadoresModels) {
        return pensadoresModels.stream()
                .map(this::converterModelParaResponse)
                .collect(Collectors.toList());
    }
}
