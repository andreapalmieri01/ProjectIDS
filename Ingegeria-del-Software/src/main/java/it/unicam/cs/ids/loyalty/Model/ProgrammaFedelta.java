package it.unicam.cs.ids.loyalty.Model;

import java.util.Date;
import java.util.UUID;

public class ProgrammaFedelta {

    private final UUID id;
    private String nome;
    private String descrizione;


    public ProgrammaFedelta(String nome, String descrizione) {
        this.id = UUID.randomUUID();
        this.nome = nome;
        this.descrizione = descrizione;
    }

    public UUID getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

}
