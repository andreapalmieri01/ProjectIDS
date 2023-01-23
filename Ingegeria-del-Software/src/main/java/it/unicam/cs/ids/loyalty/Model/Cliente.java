package it.unicam.cs.ids.loyalty.Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Cliente extends UtenteGenerico {

    private List<CartaFedelta> carteFedelta;


    public Cliente(String nome, String cognome, String indirizzo,String username, String password, String email, Number telefono) {
        super(nome, cognome, indirizzo, email, telefono, username, password);
        this.carteFedelta = new ArrayList<>();
    }

    public List<CartaFedelta> getCarteFedelta() {
        return carteFedelta;
    }
}
