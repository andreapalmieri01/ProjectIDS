package it.unicam.cs.ids.loyalty.Model;

import it.unicam.cs.ids.loyalty.Controller.ControllerProgrammaFedelta;

import java.sql.SQLException;

public class GestorePiattaforma extends UtenteGenerico {

    private ControllerProgrammaFedelta controllerGestore;

    private static int costoAdesionePiattaforma = 500;

    public GestorePiattaforma(String nome, String indirizzo, String email, Number telefono, String username, String password, ControllerProgrammaFedelta controllerGestore) {
        super(nome, indirizzo, email, telefono, username, password);

    }

    public void aggiungiProgrammaFedelta(ProgrammaFedelta programFel) throws SQLException {
        this.controllerGestore.addProgrammaFedelta(programFel);
    }

    public void  eliminaProgrammaFedelta(ProgrammaFedelta programFel){
        this.controllerGestore.deleteById(ProgrammaFedelta.getId());
    }

    public ControllerProgrammaFedelta getControllerGestore() {
        return controllerGestore;
    }

    public static int getCostoAdesionePiattaforma() {
        return costoAdesionePiattaforma;
    }
}
