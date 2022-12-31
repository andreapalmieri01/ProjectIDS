package it.unicam.cs.ids.loyalty.Controller;

import it.unicam.cs.ids.loyalty.DB_Controller;
import it.unicam.cs.ids.loyalty.Model.CartaDiCredito;
import it.unicam.cs.ids.loyalty.Model.ProgrammaLivelli;
import it.unicam.cs.ids.loyalty.Model.ProgrammaPunti;
import it.unicam.cs.ids.loyalty.Model.TitolareAttivita;

import java.sql.SQLException;
import java.util.List;

public class ControllerAdesione{

    private List<TitolareAttivita> titolari;

    /**
     * se il pagamento è stato effettuato correttamente
     * @return true , altrimenti false;
     */

    public boolean payment(){
        return true;
    }

    public void adesionePiattaforma(TitolareAttivita t) throws SQLException {
        if(payment()){
            this.titolari.add(t);
            String query = "INSERT INTO: TITOLARI ABILITATI ALLA PIATTAFORMA()";
            DB_Controller.insertQuery(query);
        }else{
            throw new IllegalArgumentException("Pagamento non effettuato");
        }
    }

}
