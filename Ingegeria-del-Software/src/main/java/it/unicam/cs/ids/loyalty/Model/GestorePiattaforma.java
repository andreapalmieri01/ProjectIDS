package it.unicam.cs.ids.loyalty.Model;

import it.unicam.cs.ids.loyalty.Controller.ControllerProgrammaFedelta;

import java.sql.SQLException;

public class GestorePiattaforma {

    private ControllerProgrammaFedelta controllerGestore;

    public GestorePiattaforma(ControllerProgrammaFedelta controllerGestore) {
        this.controllerGestore = controllerGestore;
    }

    public void aggiungiProgrammaFedelta(ProgrammaFedelta programFel) throws SQLException {
        this.controllerGestore.addProgrammaFedelta(programFel);
    }

    public void  eliminaProgrammaFedelta(ProgrammaFedelta programFel){
        this.controllerGestore.deleteById(programFel.getId());
    }
}
