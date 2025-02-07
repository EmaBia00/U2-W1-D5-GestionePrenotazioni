package com.epicode.GestionePrenotazioni.repository;

import com.epicode.GestionePrenotazioni.model.Utente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtenteRepository extends JpaRepository<Utente, Long> {
    Utente findByUsername(String username);
}