package com.estoic.api.controllers;

import com.estoic.api.dtos.PensadorDto.PensadorRequest;
import com.estoic.api.interfaces.IPensadorCrud;
import com.estoic.api.services.PensadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api_v1/pensador")
public class PensadorController {

    @Autowired
    private IPensadorCrud pensadorService;

    @PostMapping("/create")
    public ResponseEntity<String> createPensador(@DateTimeFormat(pattern = "dd/MM/yy") @RequestBody PensadorRequest pensadorRequest){
        pensadorService.registrarPensador(pensadorRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body("Pensador cadastrado com sucesso!");
    }

}
