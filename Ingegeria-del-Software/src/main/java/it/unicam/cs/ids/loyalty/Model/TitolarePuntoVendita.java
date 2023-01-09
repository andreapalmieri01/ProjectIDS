package it.unicam.cs.ids.loyalty.Model;

import it.unicam.cs.ids.loyalty.Controller.ControllerRegistrazione;

import java.util.Date;
import java.util.UUID;

public class TitolarePuntoVendita extends UtenteGenerico{


    private ControllerRegistrazione effettuaRegistrazione;

    private CartaDiCredito carta;

    public TitolarePuntoVendita(String nome,String indirizzo, String emailBusiness, Number telefono, String username, String password, CartaDiCredito carta) {
        super(nome,indirizzo, emailBusiness, telefono, username, password);
        this.carta = carta;
    }

    public ControllerRegistrazione getEffettuaRegistrazione() {
        return effettuaRegistrazione;
    }

    public CartaDiCredito getCarta() {
        return carta;
    }
}
