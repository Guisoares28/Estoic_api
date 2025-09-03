package com.estoic.api.interfaces;

import com.estoic.api.dtos.PensadorDto.FraseDto.FraseRequest;
import com.estoic.api.models.FraseModel;

public interface IFraseCrud {

    void createFrase(FraseRequest fraseRequest);

    FraseModel buscarFrasePorPensador(String nomePensador);

    FraseModel buscarFrasePorTema(String tema);
}
