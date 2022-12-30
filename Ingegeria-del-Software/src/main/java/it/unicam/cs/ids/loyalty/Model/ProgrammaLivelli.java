package it.unicam.cs.ids.loyalty.Model;

import java.util.Date;
import java.util.UUID;

public class ProgrammaLivelli extends ProgrammaFedelta {

    private int livelloMax;                 //livello massimo raggiungibile
   private int puntiTot;                    //punto da totalizzare per passare al livello successivo
    private int livelloVip;                 //Livello per passare alla fase Vip

    public ProgrammaLivelli(String nome, String descrizione, Date scadenza, int livelloMax, int puntiTot, int livelloVip) {
        super(nome, descrizione, scadenza);
        this.livelloMax = livelloMax;
        this.puntiTot = puntiTot;
        this.livelloVip = livelloVip;
    }

    public int getLivelloMax() {
        return livelloMax;
    }

    public int getPuntiTot() {
        return puntiTot;
    }

    public int getLivelloVip() {
        return livelloVip;
    }
}
