package it.unicam.cs.ids.loyalty.Model;

import it.unicam.cs.ids.loyalty.Controller.ControllerCarta;

import java.util.*;

public class PuntoVendita extends UtenteGenerico {

    private Set<ProgrammaFedelta> programmiFedelta;
    private List<Cliente> listaClienti;

    private ControllerCarta controllerCarta;

    public PuntoVendita(String nome, String indirizzo,String emailBusiness, Number telefono, String username, String password) {
        super(nome,indirizzo,emailBusiness, telefono, username, password);
    this.programmiFedelta= new HashSet<>();
    this.listaClienti=new ArrayList<>();
    controllerCarta=new ControllerCarta(this);
    }

    public void addCartaCliente(Cliente cliente) throws DateMistake {
        controllerCarta.addCarta(cliente);
    }


}
