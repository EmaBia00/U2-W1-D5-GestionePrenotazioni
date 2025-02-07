package com.epicode.GestionePrenotazioni.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "prenotazioni", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"utente_id", "dataPrenotazione"})
})
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
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
}
