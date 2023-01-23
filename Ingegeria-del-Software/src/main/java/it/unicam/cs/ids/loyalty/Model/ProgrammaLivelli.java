package it.unicam.cs.ids.loyalty.Model;

import java.util.Date;
import java.util.UUID;

public class ProgrammaLivelli extends ProgrammaFedelta {


    private int livelloMax;                 //livello massimo raggiungibile
    private int puntiTot;                    //punto da totalizzare per passare al livello successivo
    private int livelloVip;                 //Livello per passare alla fase Vip

    protected int livelloCorrente;

    public ProgrammaLivelli(String nome, String descrizione, int livelloMax, int puntiTot, int livelloVip) {
        super(nome, descrizione);
        this.livelloMax = livelloMax;
        this.puntiTot = puntiTot;
        this.livelloVip = livelloVip;
        this.livelloCorrente=0;
    }

    public ProgrammaLivelli(String nome, String descrizione) {
        super(nome, descrizione);
    }

    public ProgrammaLivelli(String nome) {
        super(nome);
    }

    public ProgrammaLivelli(String nome, int id) {
        super(nome, id);
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

    public int getLivelloCorrente() {
        return livelloCorrente;
    }

    public void incrementaLivello() {
        this.livelloCorrente++;
    }
}
