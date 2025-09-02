package com.estoic.api.dtos.PensadorDto;
import com.estoic.api.dtos.PensadorDto.ObraDto.ObraResponse;

import java.util.Date;
import java.util.Set;

public record PensadorResponse(
        Long id,
        String nome,
        String nome_completo,
        Date data_nascimento,
        Date data_morte,
        String local_nascimento,
        String biografia,
        Set<ObraResponse> obras,
        Set<FraseResponse> frases
) {
}
