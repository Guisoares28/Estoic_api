package com.estoic.api.Utils;

import com.estoic.api.dtos.PensadorDto.FraseDto.FraseRequest;
import com.estoic.api.dtos.PensadorDto.FraseDto.FraseResponse;
import com.estoic.api.interfaces.IFraseConversor;
import com.estoic.api.models.FraseModel;
import com.estoic.api.models.PensadorModel;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class FraseConversor implements IFraseConversor {
    @Override
    public FraseModel converterDeRequestParaModel(FraseRequest fraseRequest, PensadorModel pensadorModel) {
        return new FraseModel(
                fraseRequest.frase(),
                fraseRequest.tema(),
                pensadorModel
        );
    }

    @Override
    public FraseResponse converterDeModelParaResponse(FraseModel fraseModel) {
        return new FraseResponse(
                fraseModel.getId(),
                fraseModel.getFrase(),
                fraseModel.getTema()
        );
    }

    @Override
    public List<FraseResponse> converterDeModelParaResponse(List<FraseModel> frasesModels) {
        return frasesModels.stream()
                .map(this::converterDeModelParaResponse)
                .collect(Collectors.toList());
    }
}
