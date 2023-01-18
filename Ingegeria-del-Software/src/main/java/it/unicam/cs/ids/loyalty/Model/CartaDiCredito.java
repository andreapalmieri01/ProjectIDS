package it.unicam.cs.ids.loyalty.Model;

import java.util.Date;

public class CartaDiCredito {

    private TitolarePuntoVendita titolareCarta;

    private String numeroCarta;

    private Date dateScadenza;

    private String CVV;

    private String Pin;


    private double saldoCarta;

    public CartaDiCredito(TitolarePuntoVendita titolareCarta, String numeroCarta, Date dateScadenza, String CVV, String pin) throws DateMistake {
        if (numeroCarta.length()==16 && Pin.length()==5 && CVV.length()==3) {
            this.titolareCarta = titolareCarta;
            this.numeroCarta = numeroCarta;
            this.dateScadenza = dateScadenza;
            this.CVV = CVV;
            this.Pin = pin;
            this.saldoCarta=0;
        }
    }


    public void incrementaSaldo(int aggiungiDenaro){
        this.saldoCarta+=aggiungiDenaro;
    }

    public void decrementaSaldo(int togliDenaro){
        this.saldoCarta-=togliDenaro;
    }


    public double getSaldoCarta() {
        return saldoCarta;
    }

    public TitolarePuntoVendita getTitolareCarta() {
        return titolareCarta;
    }

    public String getNumeroCarta() {
        return numeroCarta;
    }

    public Date getDateScadenza() {
        return dateScadenza;
    }

    public String getCVV() {
        return CVV;
    }

    public String getPin() {
        return Pin;
    }
}
