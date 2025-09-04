package com.estoic.api.services;

import com.estoic.api.dtos.PensadorDto.FraseDto.FraseRequest;
import com.estoic.api.interfaces.IFraseConversor;
import com.estoic.api.interfaces.IFraseCrud;
import com.estoic.api.models.FraseModel;
import com.estoic.api.models.PensadorModel;
import com.estoic.api.repositories.FraseRepository;
import com.estoic.api.repositories.PensadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FraseService implements IFraseCrud {

    @Autowired
    private FraseRepository fraseRepository;

    @Autowired
    private PensadorRepository pensadorRepository;

    @Autowired
    private IFraseConversor fraseConversor;

    @Override
    public void createFrase(FraseRequest fraseRequest) {
        PensadorModel pensador = pensadorRepository.findByNomeIgnoreCase(fraseRequest.nomePensador())
                .orElseThrow(() -> new RuntimeException("Nenhum pensador encontrado com este nome"));

        FraseModel fraseModel = fraseConversor.converterDeRequestParaModel(fraseRequest, pensador);

        fraseRepository.save(fraseModel);
    }

    @Override
    public List<FraseModel> buscarFrasePorPensador(String nomePensador) {
        return fraseRepository.findByPensadorNomeIgnoreCase(nomePensador);
    }

    @Override
    public FraseModel buscarFrasePorTema(String tema) {
        return null;
    }
}
