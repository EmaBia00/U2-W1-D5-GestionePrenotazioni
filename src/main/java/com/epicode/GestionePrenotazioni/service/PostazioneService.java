package com.epicode.GestionePrenotazioni.service;

import com.epicode.GestionePrenotazioni.model.Postazione;
import com.epicode.GestionePrenotazioni.model.TipoPostazione;
import com.epicode.GestionePrenotazioni.repository.PostazioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostazioneService {

    @Autowired
    private PostazioneRepository postazioneRepository;

    public List<Postazione> getAllPostazioni() {
        return postazioneRepository.findAll();
    }

    public List<Postazione> findPostazioniByTipoAndCitta(TipoPostazione tipo, String citta) {
        return postazioneRepository.findByTipoAndEdificio_Citta(tipo, citta);
    }

    public Postazione getPostazioneById(Long id) {
        return postazioneRepository.findById(id).orElse(null);
    }

    public Postazione savePostazione(Postazione postazione) {
        return postazioneRepository.save(postazione);
    }
}