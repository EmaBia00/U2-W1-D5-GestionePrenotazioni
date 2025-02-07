package com.epicode.GestionePrenotazioni.runner;

import com.epicode.GestionePrenotazioni.model.*;
import com.epicode.GestionePrenotazioni.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private EdificioService edificioService;

    @Autowired
    private PostazioneService postazioneService;

    @Autowired
    private UtenteService utenteService;

    @Autowired
    private PrenotazioneService prenotazioneService;

    @Autowired
    private Edificio edificioA;

    @Autowired
    private Edificio edificioB;

    @Autowired
    private Postazione postazionePrivata;

    @Autowired
    private Postazione postazioneOpenspace;

    @Autowired
    private Utente utenteMario;

    @Autowired
    private Utente utenteEma;

    @Override
    public void run(String... args) throws Exception {
        // Salvataggio Edifici
        edificioService.saveEdificio(edificioA);
        edificioService.saveEdificio(edificioB);

        // Salvataggio Postazioni
        postazioneService.savePostazione(postazionePrivata);
        postazioneService.savePostazione(postazioneOpenspace);

        // Salvataggio Utenti
        utenteService.saveUtente(utenteMario);
        utenteService.saveUtente(utenteEma);

        // Creazione e salvataggio Prenotazione
        LocalDate dataPrenotazione = LocalDate.now().plusDays(1);
        Prenotazione pren1 = new Prenotazione( utenteMario, postazionePrivata, dataPrenotazione);
        prenotazioneService.savePrenotazione(pren1);
        System.out.println("✅Dati Caricati con successo sul DB");
    }
}