package com.epicode.GestionePrenotazioni.repository;

import com.epicode.GestionePrenotazioni.model.Edificio;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface EdificioRepository extends JpaRepository<Edificio, Long> {
    List<Edificio> findByCitta(String citta);
}