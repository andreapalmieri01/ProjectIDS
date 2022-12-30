package it.unicam.cs.ids.loyalty.Model;

import java.util.Date;

public class Persona {
    private String Nome;
    private String Cognome;
    private Date dataNascita;
    private String indirizzo;

    public Persona(String nome, String cognome, Date dataNascita, String indirizzo) {
        this.Nome = nome;
        this.Cognome = cognome;
        this.dataNascita = dataNascita;
        this.indirizzo = indirizzo;
    }

    public String getNome() {
        return Nome;
    }

    public String getCognome() {
        return Cognome;
    }

    public Date getDataNascita() {
        return dataNascita;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }
}
