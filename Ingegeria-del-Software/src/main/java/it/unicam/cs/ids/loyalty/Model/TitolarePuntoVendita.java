package it.unicam.cs.ids.loyalty.Model;

import it.unicam.cs.ids.loyalty.Controller.ControllerProgrammaFedelta;
import it.unicam.cs.ids.loyalty.Controller.ControllerRegistrazione;

import java.sql.SQLException;

public class TitolarePuntoVendita extends UtenteGenerico{


    private ControllerRegistrazione effettuaRegistrazione;

    private ControllerProgrammaFedelta creaProgrammaFedelta;

    private boolean abilitato;

    private GestorePiattaforma gestore;
    private CartaDiCredito carta;

    public TitolarePuntoVendita(String nome,String indirizzo, String emailBusiness, Number telefono, String username, String password, CartaDiCredito carta) {
        super(nome,indirizzo, emailBusiness, telefono, username, password);
        this.carta = carta;
        this.abilitato=false;
    }

    public ControllerRegistrazione getEffettuaRegistrazione() {
        return effettuaRegistrazione;
    }

    public CartaDiCredito getCarta() {
        return carta;
    }

    public void effettuaPagamento() throws DateMistake, SQLException {
        gestore.abilitaEsercente(this);
        abilitato=true;
    }

    public void aggiungiProgrammaFedeltaPuntoVendita() throws AbilitationException, SQLException, DateMistake {
        if(abilitato){
            this.creaProgrammaFedelta.addProgrammiTitolari(this);
        }else{
            throw new AbilitationException("Esercente non abilitato alla piattaforma");
        }
    }



}
