package it.unicam.cs.ids.loyalty.Model;

import it.unicam.cs.ids.loyalty.Controller.ControllerRegistrazione;

import java.sql.SQLException;
import java.util.Date;

public class TitolareAttivita extends UtenteGenerico {

    private String emailBusiness;

    private Number telefono;

    private ControllerRegistrazione effettuaAdesione;

    private CartaDiCredito carta;



    public TitolareAttivita(String nome, String cognome, Date dataNascita, String indirizzo, String password, String emailBusiness, Number telefono, CartaDiCredito carta) {
        super(nome, cognome, dataNascita, indirizzo, password);
        this.emailBusiness = emailBusiness;
        this.telefono = telefono;
        this.carta = carta;
    }

    public String getEmailBusiness() {
        return emailBusiness;
    }

    public Number getTelefono() {
        return telefono;
    }

    public ControllerRegistrazione getEffettuaAdesione() {
        return effettuaAdesione;
    }

    public CartaDiCredito getCarta() {
        return carta;
    }

    public void effettuaRegistrazione() throws DateMistake, SQLException {
        this.getControllerRegistrazione().registrazioneTitolari(this);
    }
}
