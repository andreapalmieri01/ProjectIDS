package it.unicam.cs.ids.loyalty.Model;

import it.unicam.cs.ids.loyalty.Controller.ControllerAdesione;

import java.util.Date;

public class TitolareAttivita extends Persona{

    private String emailBusiness;

    private Number telefono;

    private ControllerAdesione effettuaAdesione;

    private CartaDiCredito carta;

    public TitolareAttivita(String nome, String cognome, Date dataNascita, String indirizzo, String emailBusiness, Number telefono, CartaDiCredito carta) {
        super(nome, cognome, dataNascita, indirizzo);
        this.emailBusiness = emailBusiness;
        this.telefono = telefono;
        this.carta = carta;
    }
}
