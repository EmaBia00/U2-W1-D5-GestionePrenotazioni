package com.epicode.GestionePrenotazioni.service;

import com.epicode.GestionePrenotazioni.model.Utente;
import com.epicode.GestionePrenotazioni.repository.UtenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UtenteService {

    @Autowired
    private UtenteRepository utenteRepository;

    public List<Utente> getAllUtenti() {
        return utenteRepository.findAll();
    }

    public Utente getUtenteByUsername(String username) {
        return utenteRepository.findByUsername(username);
    }

    public Utente saveUtente(Utente utente) {
        return utenteRepository.save(utente);
    }
}
