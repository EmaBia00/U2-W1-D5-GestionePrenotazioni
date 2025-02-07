package com.epicode.GestionePrenotazioni.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Setter
@Getter
@Entity
@Table(name = "prenotazioni", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"utente_id", "dataPrenotazione"})
})
@NoArgsConstructor
@AllArgsConstructor
public class Prenotazione {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "utente_id", nullable = false)
    private Utente utente;

    @ManyToOne
    @JoinColumn(name = "postazione_id", nullable = false)
    private Postazione postazione;

    @Column(nullable = false)
    private LocalDate dataPrenotazione;

    public Prenotazione(Utente utente, Postazione postazione, LocalDate dataPrenotazione) {
        this.utente = utente;
        this.postazione = postazione;
        this.dataPrenotazione = dataPrenotazione;
    }

}
