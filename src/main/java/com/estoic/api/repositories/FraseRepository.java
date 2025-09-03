package com.estoic.api.repositories;

import com.estoic.api.models.FraseModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FraseRepository extends JpaRepository<FraseModel, Long> {
}
