package it.unicam.cs.ids.loyalty.Model;

import it.unicam.cs.ids.loyalty.Controller.ControllerRegistrazione;

import java.util.Date;
import java.util.UUID;

public class UtenteGenerico {
    private UUID id;
    private String Nome;
    private String indirizzo;

    private String email;

    private Number telefono;

    private String username;
    private String password;

    private ControllerRegistrazione controllerRegistrazione;

    public UtenteGenerico(String nome, String indirizzo, String email, Number telefono,  String username, String password) {
        this.id=UUID.randomUUID();
        this.Nome = nome;
        this.indirizzo = indirizzo;
        this.email=email;
        this.telefono=telefono;
        this.username=username;
        this.password=password;
    }


    public UUID getId() {
        return id;
    }

    public String getNome() {
        return Nome;
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
}
