package com.estoic.api.interfaces;

import com.estoic.api.dtos.PensadorDto.FraseDto.FraseRequest;
import com.estoic.api.dtos.PensadorDto.FraseDto.FraseResponse;
import com.estoic.api.models.FraseModel;
import com.estoic.api.models.PensadorModel;

import java.util.List;

public interface IFraseConversor {

    FraseModel converterDeRequestParaModel(FraseRequest fraseRequest, PensadorModel pensadorModel);

    FraseResponse converterDeModelParaResponse(FraseModel fraseModel);

    List<FraseResponse> converterDeModelParaResponse(List<FraseModel> frasesModels);

}
