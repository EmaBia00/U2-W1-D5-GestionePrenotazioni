package com.epicode.GestionePrenotazioni.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "postazioni")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Postazione {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String codice;

    @Column(nullable = false)
    private String descrizione;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TipoPostazione tipo;

    @Column(nullable = false)
    private int maxOccupanti;

    @ManyToOne
    @JoinColumn(name = "edificio_id", nullable = false)
    private Edificio edificio;

    public Postazione(String codice, String descrizione, TipoPostazione tipo, int maxOccupanti, Edificio edificio) {
        this.codice = codice;
        this.descrizione = descrizione;
        this.tipo = tipo;
        this.maxOccupanti = maxOccupanti;
        this.edificio = edificio;
    }
}
