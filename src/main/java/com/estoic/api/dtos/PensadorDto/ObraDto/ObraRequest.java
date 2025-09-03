package com.estoic.api.dtos.PensadorDto.ObraDto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.Date;

public record ObraRequest(
        @NotBlank(message = "Título não pode ser vazio")
        String titulo,
        Date ano_publicacao,
        @NotBlank(message = "Descrição não pode ser nula")
        String descricao
) {
}
