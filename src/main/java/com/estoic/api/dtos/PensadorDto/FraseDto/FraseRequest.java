package com.estoic.api.dtos.PensadorDto.FraseDto;

import jakarta.validation.constraints.NotBlank;

public record FraseRequest(
        @NotBlank(message = "Frase não pode ser vazia")
        String frase,

        @NotBlank(message = "Tema não pode ser vazio")
        String tema
) {
}
