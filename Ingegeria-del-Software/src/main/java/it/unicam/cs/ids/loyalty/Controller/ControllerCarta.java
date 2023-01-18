package it.unicam.cs.ids.loyalty.Controller;

import it.unicam.cs.ids.loyalty.DB_Controller;
import it.unicam.cs.ids.loyalty.Model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ControllerCarta {

    private DB_Controller db_controller;

    private List<CartaFedelta> cartaFedeltaList;

    private PuntoVendita puntoVendita;

    public ControllerCarta(PuntoVendita puntoVendita) {
        this.cartaFedeltaList = new ArrayList<>();
        this.puntoVendita=puntoVendita;
    }

    public void addCarta(Cliente cliente) throws DateMistake {
        for (CartaFedelta cf : cliente.getCarteFedelta()) {
            if (cf.getCartaPuntoVendita()==puntoVendita){
                throw new DateMistake();
            }
        }
        CartaFedelta cartaFedelta = new CartaFedelta(this.puntoVendita.getNome(), this.puntoVendita, cliente);
        cliente.getCarteFedelta().add(cartaFedelta);

    }

    public CartaFedelta findById(UUID id) {
        CartaFedelta cartaFedelta=null;
        for (CartaFedelta p: this.cartaFedeltaList){
            if(p.getId()==id)
                cartaFedelta=p;
        }
        if(cartaFedelta==null){
            throw new NullPointerException();
        }
        return cartaFedelta;
    }

    /**
     * aggiungi database (scelte)


    public void confermaScelte(){

    }
     */
}

