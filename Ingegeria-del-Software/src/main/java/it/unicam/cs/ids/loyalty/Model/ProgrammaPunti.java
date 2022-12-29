package it.unicam.cs.ids.loyalty.Model;

import java.util.Date;
import java.util.UUID;

public class ProgrammaPunti extends ProgrammaFedelta {

    private double valoreXPunto;    //Valore in euro per singolo punto
    private int totPunti;       //Punti da totalizzare per ottenere coupon
    private Coupon coupon;      //vantaggio ottenibile al raggiungimento di una certa soglia di punti

    public ProgrammaPunti(UUID id, String nome, String descrizione, Date scadenza, double valoreXPunto, int totPunti, Coupon coupon) {
        super(id, nome, descrizione, scadenza);
        this.valoreXPunto= valoreXPunto;
        this.totPunti= totPunti;
        this.coupon= coupon;
    }

    public double getValoreXPunto() {
        return valoreXPunto;
    }

    public int getTotPunti() {
        return totPunti;
    }

    public Coupon getCoupon() {
        return coupon;
    }
}
