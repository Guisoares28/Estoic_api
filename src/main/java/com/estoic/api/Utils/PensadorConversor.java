package com.estoic.api.Utils;

import com.estoic.api.dtos.PensadorDto.PensadorRequest;
import com.estoic.api.dtos.PensadorDto.PensadorResponse;
import com.estoic.api.interfaces.IPensadorConversor;
import com.estoic.api.models.PensadorModel;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

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
                pensadorModel.getAno_nascimento(),
                pensadorModel.getAno_morte(),
                pensadorModel.getLocal_nascimento(),
                pensadorModel.getBiografia_resumida()
        );
    }

    @Override
    public LocalDate converterStringParaLocalDate(String data) {
        return null;
    }
}
