package com.epicode.GestionePrenotazioni.configuration;

import com.epicode.GestionePrenotazioni.model.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Edificio edificioA() {
        return new Edificio( "Edificio A", "Via Martiri di marzabotto 1", "Milano");
    }

    @Bean
    public Edificio edificioB() {
        return new Edificio( "Edificio B", "Via delle Chiese 15", "Torino");
    }

    @Bean
    public Postazione postazionePrivata(Edificio edificioA) {
        return new Postazione( "P1", "Ufficio privato", TipoPostazione.PRIVATO, 1, edificioA);
    }

    @Bean
    public Postazione postazioneOpenspace(Edificio edificioB) {
        return new Postazione( "P2", "Spazio condiviso", TipoPostazione.OPENSPACE, 5, edificioB);
    }

    @Bean
    public Utente utenteMario() {
        return new Utente( "mrossi", "Mario Rossi", "mrossi@example.com");
    }

    @Bean
    public Utente utenteEma() {
        return new Utente( "ebianchi", "Emanuele Bianchi", "ebianchi@example.com");
    }
}