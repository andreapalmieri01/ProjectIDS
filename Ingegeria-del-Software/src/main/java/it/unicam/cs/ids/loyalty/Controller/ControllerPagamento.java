package it.unicam.cs.ids.loyalty.Controller;

import it.unicam.cs.ids.loyalty.DB_Controller;
import it.unicam.cs.ids.loyalty.Model.GestorePiattaforma;
import it.unicam.cs.ids.loyalty.Model.StatoPagamento;
import it.unicam.cs.ids.loyalty.Model.TitolarePuntoVendita;

public class ControllerPagamento {

    private TitolarePuntoVendita titolarePuntoVendita;

    private DB_Controller db_controller;


    /**
     * se il pagamento è stato effettuato correttamente
     *
     * @return true , altrimenti false;
     */

    public boolean payment() {
        if (titolarePuntoVendita.getCarta().getSaldoCarta()>GestorePiattaforma.getCostoAdesionePiattaforma()){
            titolarePuntoVendita.getCarta().decrementaSaldo(GestorePiattaforma.getCostoAdesionePiattaforma());
            return true;
        }
            return false;
    }


}