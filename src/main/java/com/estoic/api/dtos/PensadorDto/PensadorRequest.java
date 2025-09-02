package com.estoic.api.dtos.PensadorDto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;

public record PensadorRequest(
        @NotBlank(message = "nome não pode ser vazio")
        String nome,
        @NotBlank(message = "nome completo não pode ser vazio")
        String nome_completo,
        @NotBlank(message = "data nascimento não pode ser vazia")
        String data_nascimento,
        @NotBlank(message = "data morte não pode ser vazia")
        String data_morte,
        @NotBlank(message = "local nascimento não pode ser vazio")
        String local_nascimento,
        @NotBlank(message = "biografia não pode ser vazio")
        @Max(100)
        String biografia
) {}
