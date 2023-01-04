package it.unicam.cs.ids.loyalty.Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Cliente extends UtenteGenerico {

    private String cognome;
    private List<CartaFedelta> carteFedelta;


    public Cliente(String nome, String cognome, String indirizzo,String username, String password, String email, Number telefono) {
        super(nome,indirizzo, email, telefono, username, password);
        this.cognome=cognome;
        this.carteFedelta = new ArrayList<>();
    }

    public String getCognome() {
        return cognome;
    }


    public List<CartaFedelta> getCarteFedelta() {
        return carteFedelta;
    }
}
