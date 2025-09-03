package com.estoic.api.dtos.PensadorDto;

public record PensadorResponse(
        Long id,
        String nome,
        String nome_completo,
        Integer ano_nasicmento,
        Integer ano_morte,
        String local_nascimento,
        String biografia
) {
}
