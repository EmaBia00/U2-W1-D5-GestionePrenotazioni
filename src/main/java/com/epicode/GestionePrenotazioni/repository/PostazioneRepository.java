package com.epicode.GestionePrenotazioni.repository;

import com.epicode.GestionePrenotazioni.model.Postazione;
import com.epicode.GestionePrenotazioni.model.TipoPostazione;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PostazioneRepository extends JpaRepository<Postazione, Long> {
    List<Postazione> findByTipoAndEdificio_Citta(TipoPostazione tipo, String citta);
}