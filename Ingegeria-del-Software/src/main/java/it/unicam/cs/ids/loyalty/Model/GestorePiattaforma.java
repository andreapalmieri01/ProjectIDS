package it.unicam.cs.ids.loyalty.Model;

import it.unicam.cs.ids.loyalty.Controller.ControllerProgrammaFedelta;
import it.unicam.cs.ids.loyalty.Controller.ControllerRegistrazione;

import java.sql.SQLException;

public class GestorePiattaforma extends UtenteGenerico {

    private ControllerProgrammaFedelta controllerGestore;

    private ControllerRegistrazione registrazioneTitolare;

    private static int costoAdesionePiattaforma = 500;

    public GestorePiattaforma(String nome, String indirizzo, String email, Number telefono, String username, String password) {
        super(nome, indirizzo, email, telefono, username, password);

    }

    public void aggiungiProgrammaFedelta(ProgrammaFedelta programFel) throws SQLException {
        this.controllerGestore.addProgrammaFedelta(programFel);
    }

    public void visualizzaProgrammiFedelta() throws SQLException {
        this.controllerGestore.visualizzaProgrammiFedelta();
    }

    public void  eliminaProgrammaFedelta(ProgrammaFedelta programFel) throws SQLException {
        this.controllerGestore.deleteById(programFel.getId());
    }


    public ControllerProgrammaFedelta getControllerGestore() {
        return controllerGestore;
    }

    public static int getCostoAdesionePiattaforma() {
        return costoAdesionePiattaforma;
    }

    public void abilitaEsercente(TitolarePuntoVendita t) throws DateMistake, SQLException {
        this.registrazioneTitolare.registrazioneTitolari(t);
    }

    public void visualizzaTuttiEsercentiAbilitati() throws SQLException {
        this.registrazioneTitolare.visualizzaTitolari();
    }
}
