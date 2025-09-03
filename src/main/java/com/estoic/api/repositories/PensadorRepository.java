package com.estoic.api.repositories;

import com.estoic.api.models.PensadorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PensadorRepository extends JpaRepository<PensadorModel, Long> {
}
