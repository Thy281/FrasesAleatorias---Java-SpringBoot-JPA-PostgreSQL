package com.calculator.frasefilmes.repository;

import com.calculator.frasefilmes.model.FrasesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FraseRepository extends JpaRepository<FrasesEntity, Long> {
    @Query("SELECT f FROM FrasesEntity f ORDER BY FUNCTION('RANDOM') LIMIT 1")
    List<FrasesEntity> buscaFraseAleatoria();
}
