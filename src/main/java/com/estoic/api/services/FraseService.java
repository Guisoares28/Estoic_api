package com.estoic.api.services;

import com.estoic.api.dtos.PensadorDto.FraseDto.FraseRequest;
import com.estoic.api.interfaces.IFraseCrud;
import com.estoic.api.models.FraseModel;

public class FraseService implements IFraseCrud {
    @Override
    public void createFrase(FraseRequest fraseRequest) {

    }

    @Override
    public FraseModel buscarFrasePorPensador(String nomePensador) {
        return null;
    }

    @Override
    public FraseModel buscarFrasePorTema(String tema) {
        return null;
    }
}
