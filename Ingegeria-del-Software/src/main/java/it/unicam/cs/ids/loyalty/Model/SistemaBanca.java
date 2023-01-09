package it.unicam.cs.ids.loyalty.Model;

import it.unicam.cs.ids.loyalty.Controller.ControllerPagamento;

public class SistemaBanca {

    private StatoPagamento pagamento;

    private ControllerPagamento statoPagamento;

    public SistemaBanca() {
        if (statoPagamento.payment()){
            pagamento=StatoPagamento.PAGATO;
        }
        pagamento=StatoPagamento.In_Attesa;
    }

    public StatoPagamento getPagamento() {
        return pagamento;
    }
}
