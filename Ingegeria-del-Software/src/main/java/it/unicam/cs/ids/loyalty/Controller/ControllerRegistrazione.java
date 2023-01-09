package it.unicam.cs.ids.loyalty.Controller;

import it.unicam.cs.ids.loyalty.DB_Controller;
import it.unicam.cs.ids.loyalty.Model.*;

import java.sql.SQLException;
import java.util.List;

public class ControllerRegistrazione {

    private List<Cliente> clienti;

    private List<TitolarePuntoVendita> titolariAttivita;

    private SistemaBanca sistemaBanca;



    public void registrazioneTitolari(TitolarePuntoVendita t ) throws SQLException, DateMistake {
        if (this.validazioneDati(t)) {
                if (sistemaBanca.getPagamento()==StatoPagamento.PAGATO) {

                this.titolariAttivita.add(t);
                String query = "INSERT INTO: TITOLARE AGGIUNTO ALLA PIATTAFORMA()";
                DB_Controller.insertQuery(query);
            } else {
                throw new DateMistake();
            }
        }
    }

    /**
     * metodo per controllare se i dati inseriti sono corretti
     *
     * @param ug
     *
     * @return true se i dati sono corretti, false altrimenti.
     *
     */
    private boolean validazioneDati(UtenteGenerico ug){
        if (ug.getNome()==null || ug.getIndirizzo()==null || ug.getEmail()==null || ug.getTelefono()==null || ug.getUsername()==null || ug.getPassword()==null){
            return false;
        }
        return true;
    }

}















