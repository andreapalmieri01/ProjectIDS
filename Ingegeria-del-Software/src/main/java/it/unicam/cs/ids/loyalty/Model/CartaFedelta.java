package it.unicam.cs.ids.loyalty.Model;

import java.util.Date;
import java.util.UUID;

public class CartaFedelta {

    private UUID id;

    private String nomeCarta;

    private Date scadenza;

    private final CommessoPuntoVendita cartaPuntoVendita;

    private Cliente cliente;



    public CartaFedelta(String nomeCarta, Date scadenza, CommessoPuntoVendita cartaPuntoVendita, Cliente cliente) {
        this.cartaPuntoVendita = cartaPuntoVendita;
        this.cliente=cliente;
        this.id=UUID.randomUUID();
        this.nomeCarta = nomeCarta;
        this.scadenza = scadenza;
    }

    public CartaFedelta(String nomeCarta, CommessoPuntoVendita cartaPuntoVendita, Cliente cliente) {
        this.id=UUID.randomUUID();
        this.nomeCarta = nomeCarta;
        this.cartaPuntoVendita = cartaPuntoVendita;
        this.cliente = cliente;
    }

    public UUID getId() {
        return id;
    }

    public String getNomeCarta() {
        return nomeCarta;
    }

    public void setNomeCarta(String nomeCarta) {
        this.nomeCarta = nomeCarta;
    }

    public Date getScadenza() {
        return scadenza;
    }

    public void setScadenza(Date scadenza) {
        this.scadenza = scadenza;
    }

    public CommessoPuntoVendita getCartaPuntoVendita() {
        return cartaPuntoVendita;
    }
}
