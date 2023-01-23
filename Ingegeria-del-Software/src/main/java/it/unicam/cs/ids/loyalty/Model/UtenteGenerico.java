package it.unicam.cs.ids.loyalty.Model;

import it.unicam.cs.ids.loyalty.Controller.ControllerRegistrazione;

import java.util.Objects;
import java.util.UUID;

public class UtenteGenerico {
    private int id;
    private String Nome;

    private String cognome;
    private String indirizzo;

    private String email;

    private Number telefono;

    private String username;
    private String password;

    private ControllerRegistrazione controllerRegistrazione;

    public UtenteGenerico(String nome, String cognome,  String indirizzo, String email, Number telefono,  String username, String password) {
        this.id=randomInt();
        this.Nome = nome;
        this.cognome=cognome;
        this.indirizzo = indirizzo;
        this.email=email;
        this.telefono=telefono;
        this.username=username;
        this.password=password;
    }

    private int randomInt() {
        double doubleRandom=0;
        if(this instanceof TitolarePuntoVendita)
        {
            doubleRandom=Math.random()*4000;
        }
        int intRandom=(int ) doubleRandom;
        return intRandom;
    }


    public int getId() {
        return id;
    }

    public String getNome() {
        return Nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public String getEmail() {
        return email;
    }

    public Number getTelefono() {
        return telefono;
    }

    public String getUsername() {
        return username;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UtenteGenerico that = (UtenteGenerico) o;
        return Objects.equals(id, that.id) && Objects.equals(email, that.email) && Objects.equals(username, that.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, username);
    }
}
