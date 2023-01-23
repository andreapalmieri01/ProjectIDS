package it.unicam.cs.ids.loyalty.Model;

import it.unicam.cs.ids.loyalty.Controller.ControllerProgrammaFedelta;
import it.unicam.cs.ids.loyalty.Controller.ControllerRegistrazione;

import java.sql.SQLException;

public class GestorePiattaforma extends UtenteGenerico {


    private static int costoAdesionePiattaforma = 500;

    public GestorePiattaforma(String nome, String cognome, String indirizzo, String email, Number telefono, String username, String password) {
        super(nome, cognome, indirizzo, email, telefono, username, password);

    }



    public static int getCostoAdesionePiattaforma() {
        return costoAdesionePiattaforma;
    }


}
