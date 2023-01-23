package it.unicam.cs.ids.loyalty.Model;

import java.util.*;

public class CommessoPuntoVendita extends UtenteGenerico {

    private Set<ProgrammaFedelta> programmiFedelta;
    private List<Cliente> listaClienti;

    public CommessoPuntoVendita(String nome, String cognome, String indirizzo, String emailBusiness, Number telefono, String username, String password) {
        super(nome, cognome, indirizzo,emailBusiness, telefono, username, password);
    this.programmiFedelta= new HashSet<>();
    this.listaClienti=new ArrayList<>();
    }


}
