package com.epicode.GestionePrenotazioni.repository;

import com.epicode.GestionePrenotazioni.model.Postazione;
import com.epicode.GestionePrenotazioni.model.Prenotazione;
import com.epicode.GestionePrenotazioni.model.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDate;
import java.util.List;

public interface PrenotazioneRepository extends JpaRepository<Prenotazione, Long> {
    List<Prenotazione> findByUtente(Utente utente);
    boolean existsByPostazioneAndDataPrenotazione(Postazione postazione, LocalDate data);
}
