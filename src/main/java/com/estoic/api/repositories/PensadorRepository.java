package com.estoic.api.repositories;

import com.estoic.api.models.PensadorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PensadorRepository extends JpaRepository<PensadorModel, Long> {

    Optional<PensadorModel> findByNomeIgnoreCase(String nome);

    Optional<List<PensadorModel>> findByAnoNascimento(Integer anoNascimento);

    Optional<List<PensadorModel>> findByAnoMorte(Integer anoMorte);

    Optional<List<PensadorModel>> findByLocalNascimentoContainingIgnoreCase(String local);
}
