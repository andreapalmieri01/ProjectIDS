package it.unicam.cs.ids.loyalty.Controller;

import it.unicam.cs.ids.loyalty.DB_Controller;
import it.unicam.cs.ids.loyalty.Model.Cliente;
import it.unicam.cs.ids.loyalty.Model.DateMistake;
import it.unicam.cs.ids.loyalty.Model.TitolareAttivita;
import it.unicam.cs.ids.loyalty.Model.UtenteGenerico;

import java.sql.SQLException;
import java.util.List;

public class ControllerRegistrazione {

    private List<Cliente> clienti;

    private List<TitolareAttivita> titolariAttivita;


    /**
     * se il pagamento è stato effettuato correttamente
     * @return true , altrimenti false;
     */

    public boolean payment(){
        return true;
    }

    public void registrazioneTitolari(TitolareAttivita t ) throws SQLException, DateMistake {
        if(payment()){
            if (this.validazioneDati(t)){
                this.titolariAttivita.add(t);
                String query = "INSERT INTO: TITOLARE AGGIUNTO ALLA PIATTAFORMA()";
                DB_Controller.insertQuery(query);
            }else{
                throw new DateMistake();
            }
        }else{
            throw new IllegalArgumentException("Pagamento non effettuato");
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
        if (ug.getNome()==null || ug.getCognome()==null || ug.getDataNascita()==null || ug.getIndirizzo()==null || ug.getPassword()==null){
            return false;
        }
        return true;
    }

}
