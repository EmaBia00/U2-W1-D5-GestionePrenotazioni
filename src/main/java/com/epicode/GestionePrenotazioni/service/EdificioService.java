package com.epicode.GestionePrenotazioni.service;

import com.epicode.GestionePrenotazioni.model.Edificio;
import com.epicode.GestionePrenotazioni.repository.EdificioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EdificioService {

    @Autowired
    private EdificioRepository edificioRepository;

    public List<Edificio> getAllEdifici() {
        return edificioRepository.findAll();
    }

    public Edificio getEdificioById(Long id) {
        return edificioRepository.findById(id).orElse(null);
    }

    public void saveEdificio(Edificio edificio) {
        edificioRepository.save(edificio);
    }
}