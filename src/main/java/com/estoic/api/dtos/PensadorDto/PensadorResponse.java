package com.estoic.api.dtos.PensadorDto;

public record PensadorResponse(
        Long id,
        String nome,
        String nome_completo,
        Integer ano_nascimento,
        Integer ano_morte,
        String local_nascimento,
        String biografia
) {
}
