package org.example;

public class Maquineta {

    private PagamentoListener listener;

    public Maquineta(PagamentoListener listener){
        setListener(listener);
    }

    public PagamentoListener getListener(){
        return listener;
    }

    public void setListener(PagamentoListener listener){
        this.listener = listener;
    }

    public void realizarPagamento(double valorNecessario, double valorInformado){
        if(valorInformado > valorNecessario)
            listener.pagamento(new PagamentoEvent(true, "Troco de R$"+(valorInformado-valorNecessario)));
        else if(valorInformado == valorNecessario)
            listener.pagamento(new PagamentoEvent(true, "Valor correto"));
        else
            listener.pagamento((new PagamentoEvent(false, "O valor informado foi abaixo do valor necessário para completar a compra")));
    }

}
