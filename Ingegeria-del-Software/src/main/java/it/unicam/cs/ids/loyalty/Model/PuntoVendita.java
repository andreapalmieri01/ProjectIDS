package it.unicam.cs.ids.loyalty.Model;

import java.util.*;

public class PuntoVendita extends UtenteGenerico {

    private Set<ProgrammaFedelta> programmiFedelta;
    private List<Cliente> listaClienti;

    public PuntoVendita(String nome, String indirizzo,String emailBusiness, Number telefono, String username, String password) {
        super(nome,indirizzo,emailBusiness, telefono, username, password);
    this.programmiFedelta= new HashSet<>();
    this.listaClienti=new ArrayList<>();
    }


}
