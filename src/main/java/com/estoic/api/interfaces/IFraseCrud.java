package com.estoic.api.interfaces;

import com.estoic.api.dtos.PensadorDto.FraseDto.FraseRequest;
import com.estoic.api.models.FraseModel;
import org.springframework.stereotype.Component;

import java.util.List;

public interface IFraseCrud {

    void createFrase(FraseRequest fraseRequest);

    List<FraseModel> buscarFrasePorPensador(String nomePensador);

    FraseModel buscarFrasePorTema(String tema);
}
