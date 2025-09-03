package com.estoic.api.interfaces;

import com.estoic.api.dtos.PensadorDto.PensadorRequest;
import com.estoic.api.dtos.PensadorDto.PensadorResponse;
import com.estoic.api.models.PensadorModel;

import java.time.LocalDate;
import java.util.List;

public interface IPensadorConversor {

    PensadorModel converterRequestParaModel(PensadorRequest pensadorRequest);

    PensadorResponse converterModelParaResponse(PensadorModel pensadorModel);

    LocalDate converterStringParaLocalDate(String data);

    List<PensadorResponse> converterModelParaResponse(List<PensadorModel> pensadoresModels);
}
