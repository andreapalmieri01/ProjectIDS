package it.unicam.cs.ids.loyalty.Model;

import java.util.Date;

public class Cliente extends UtenteGenerico {

    private String email;
    private Number telefono;
    private String nomeUtente;
    private CartaFedelta cartaFedelta;


    public Cliente(String nome, String cognome, Date dataNascita, String indirizzo,String password, String email, Number telefono, String nomeUtente, CartaFedelta cartaFedelta) {
        super(nome, cognome, dataNascita, indirizzo, password);
        this.email = email;
        this.telefono = telefono;
        this.nomeUtente = nomeUtente;
        this.cartaFedelta = cartaFedelta;
    }
    public Cliente(String nome, String cognome, Date dataNascita, String indirizzo, String password ,String email, Number telefono, String nomeUtente) {
        super(nome, cognome, dataNascita, indirizzo, password);
        this.email = email;
        this.telefono = telefono;
        this.nomeUtente = nomeUtente;
    }

    public String getEmail() {
        return email;
    }

    public Number getTelefono() {
        return telefono;
    }

    public String getNomeUtente() {
        return nomeUtente;
    }

    public CartaFedelta getCartaFedelta() {
        return cartaFedelta;
    }
}
