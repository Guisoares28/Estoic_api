package com.estoic.api.controllers;

import com.estoic.api.dtos.PensadorDto.PensadorRequest;
import com.estoic.api.dtos.PensadorDto.PensadorResponse;
import com.estoic.api.interfaces.IPensadorCrud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


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

    @GetMapping("/{nome}")
    public ResponseEntity<PensadorResponse> buscarPensadorPorNome(@PathVariable String nome){
        return ResponseEntity.status(HttpStatus.OK).body(pensadorService.recuperarPensadorPorNome(nome));
    }

    @GetMapping("/all")
    public ResponseEntity<List<PensadorResponse>> buscarTodosOsPensadores(){
        return ResponseEntity.status(HttpStatus.OK).body(pensadorService.recuperarTodosOsPensadores());
    }

    @GetMapping("/nascimento/{anoNascimento}")
    public ResponseEntity<List<PensadorResponse>> buscarPensadoresPorAnoNascimento(@PathVariable Integer anoNascimento){
        return ResponseEntity.status(HttpStatus.OK).body(pensadorService.recuperarPensadoresPorAnoNascimento(anoNascimento));
    }

    @GetMapping("/morte/{anoMorte}")
    public ResponseEntity<List<PensadorResponse>> buscarPensadoresPorAnoMorte(@PathVariable Integer anoMorte){
        return ResponseEntity.status(HttpStatus.OK).body(pensadorService.recuperarPensadoresPorAnoDaMorte(anoMorte));
    }

}
