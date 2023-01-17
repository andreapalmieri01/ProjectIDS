package it.unicam.cs.ids.loyalty.Model;

import java.util.Date;
import java.util.UUID;

public class CartaFedelta {

    private UUID id;

    private String nomeCarta;

    private Date scadenza;

    private final PuntoVendita cartaPuntoVendita;

    private Cliente cliente;



    public CartaFedelta(String nomeCarta, Date scadenza, PuntoVendita cartaPuntoVendita, Cliente cliente) {
        this.cartaPuntoVendita = cartaPuntoVendita;
        this.cliente=cliente;
        this.id=UUID.randomUUID();
        this.nomeCarta = nomeCarta;
        this.scadenza = scadenza;
    }

    public CartaFedelta( String nomeCarta, PuntoVendita cartaPuntoVendita, Cliente cliente) {
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

    public PuntoVendita getCartaPuntoVendita() {
        return cartaPuntoVendita;
    }
}
