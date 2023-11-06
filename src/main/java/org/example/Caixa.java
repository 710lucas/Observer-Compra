package org.example;

import java.util.Scanner;

public class Caixa implements PagamentoListener{


    public void inicializarPedido(Produto produto){

        System.out.println("Você precisa pagar: "+produto.getPreco());

    }

    public void finalizarPedido(String mensagem){

        System.out.println("Pedido finalizado com sucesso: ");
        System.out.println(mensagem);

    }

    public void erroPedido(String mensagem){
        System.out.println("Houve um erro no pagamento");
        System.out.println(mensagem);
    }

    @Override
    public void pagamento(PagamentoEvent evento) {
        if(evento.isConfirmado())
            finalizarPedido(evento.getMensagem());
        else
            erroPedido(evento.getMensagem());
    }
}
