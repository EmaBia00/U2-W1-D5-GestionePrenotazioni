package com.epicode.GestionePrenotazioni.service;

import com.epicode.GestionePrenotazioni.model.Postazione;
import com.epicode.GestionePrenotazioni.model.Prenotazione;
import com.epicode.GestionePrenotazioni.model.Utente;
import com.epicode.GestionePrenotazioni.repository.PrenotazioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class PrenotazioneService {

    @Autowired
    private PrenotazioneRepository prenotazioneRepository;

    public List<Prenotazione> getPrenotazioniByUtente(Utente utente) {
        return prenotazioneRepository.findByUtente(utente);
    }

    public boolean isPostazioneDisponibile(Postazione postazione, LocalDate data) {
        return !prenotazioneRepository.existsByPostazioneAndDataPrenotazione(postazione, data);
    }

    public void savePrenotazione(Prenotazione prenotazione) {
        if (isPostazioneDisponibile(prenotazione.getPostazione(), prenotazione.getDataPrenotazione())) {
            prenotazioneRepository.save(prenotazione);
            return;
        }
        throw new RuntimeException("Postazione non disponibile per la data selezionata.");
    }
}