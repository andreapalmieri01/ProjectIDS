package it.unicam.cs.ids.loyalty.Model;

import it.unicam.cs.ids.loyalty.Controller.ControllerRegistrazione;

import java.util.Date;

public class UtenteGenerico {
    private String Nome;
    private String Cognome;
    private Date dataNascita;
    private String indirizzo;
    private String password;

    private ControllerRegistrazione controllerRegistrazione;

    public UtenteGenerico(String nome, String cognome, Date dataNascita, String indirizzo, String password) {
        this.Nome = nome;
        this.Cognome = cognome;
        this.dataNascita = dataNascita;
        this.indirizzo = indirizzo;
        this.password=password;
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

    public String getPassword() {
        return password;
    }

    public ControllerRegistrazione getControllerRegistrazione() {
        return controllerRegistrazione;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }
}
