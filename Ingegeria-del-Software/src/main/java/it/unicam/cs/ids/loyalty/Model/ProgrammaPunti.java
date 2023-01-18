package it.unicam.cs.ids.loyalty.Model;

import java.util.UUID;

public class ProgrammaPunti extends ProgrammaFedelta {

    private static final UUID id = UUID.randomUUID();
    private double valoreXPunto;    //Valore in euro per singolo punto
    private int totPunti;       //Punti da totalizzare per ottenere coupon
    private Coupon coupon;      //vantaggio ottenibile al raggiungimento di una certa soglia di punti

    public ProgrammaPunti(String nome, String descrizione,  double valoreXPunto, int totPunti, Coupon coupon) {
        super(nome, descrizione);
        this.valoreXPunto= valoreXPunto;
        this.totPunti= totPunti;
        this.coupon= coupon;
    }

    public ProgrammaPunti(String nome, String descrizione) {
        super(nome, descrizione);
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
