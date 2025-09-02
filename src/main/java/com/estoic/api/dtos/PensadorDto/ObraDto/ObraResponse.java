package com.estoic.api.dtos.PensadorDto.ObraDto;

import java.util.Date;

public record ObraResponse(
        Long id,
        String titulo,
        Date ano_publicacao,
        String descricao,
        String autor
) {
}
