package it.unicam.cs.ids.loyalty.Model;

import java.util.Date;
import java.util.Objects;
import java.util.UUID;

public class ProgrammaFedelta {

    private String nome;
    private String descrizione;


    public ProgrammaFedelta(String nome, String descrizione) {
        this.nome = nome;
        this.descrizione = descrizione;
    }

    public String getNome() {
        return nome;
    }

    public String getDescrizione() {
        return descrizione;
    }
}
