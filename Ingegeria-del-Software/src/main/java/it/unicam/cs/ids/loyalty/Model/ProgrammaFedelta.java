package it.unicam.cs.ids.loyalty.Model;

import java.util.Random;
import java.util.UUID;

public class ProgrammaFedelta {

    private String nome;

    private String descrizione;

    private final int id;


    public ProgrammaFedelta(String nome, String descrizione) {
        this.id= randomInt();
        this.nome = nome;
        this.descrizione = descrizione;
    }

    public ProgrammaFedelta(String nome) {
        this.id=randomInt();
        this.nome = nome;
    }

    public ProgrammaFedelta(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    private int randomInt(){
        double doubleRandom=0;
        if(this instanceof ProgrammaPunti){
            doubleRandom= Math.random()*1000;
        }else  doubleRandom= Math.random()*2000;
        int intRandom= (int) doubleRandom;
        return intRandom;
    }
    public  int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescrizione() {
        return descrizione;
    }
}
