package com.estoic.api.repositories;

import com.estoic.api.models.FraseModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FraseRepository extends JpaRepository<FraseModel, Long> {

    List<FraseModel> findByPensadorNomeIgnoreCase(String nomePensador);

}
