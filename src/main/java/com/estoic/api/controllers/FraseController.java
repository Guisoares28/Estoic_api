package com.estoic.api.controllers;

import com.estoic.api.Utils.FraseConversor;
import com.estoic.api.dtos.PensadorDto.FraseDto.FraseRequest;
import com.estoic.api.dtos.PensadorDto.FraseDto.FraseResponse;
import com.estoic.api.interfaces.IFraseConversor;
import com.estoic.api.interfaces.IFraseCrud;
import com.estoic.api.models.FraseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api_v1/frase")
public class FraseController {

    @Autowired
    private IFraseCrud fraseService;

    @Autowired
    private IFraseConversor fraseConversor;

    @PostMapping()
    public ResponseEntity<Void> createFrase(@RequestBody FraseRequest fraseRequest){

        fraseService.createFrase(fraseRequest);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/{nomePensador}")
    public ResponseEntity<List<FraseResponse>> buscarFrasesPorPensador(@PathVariable String nomePensador){
        List<FraseModel> frasesModels = fraseService.buscarFrasePorPensador(nomePensador);
        return ResponseEntity.status(HttpStatus.OK).body(fraseConversor.converterDeModelParaResponse(frasesModels));
    }

}
