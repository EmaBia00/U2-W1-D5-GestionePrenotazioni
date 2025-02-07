package com.epicode.GestionePrenotazioni.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "utenti")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Utente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String nomeCompleto;

    @Column(nullable = false, unique = true)
    private String email;

    public Utente(String username, String nomeCompleto, String email) {
        this.username = username;
        this.nomeCompleto = nomeCompleto;
        this.email = email;
    }
}
