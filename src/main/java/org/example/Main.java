package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Produto p = new Produto("Biscoioto", 10);
        Caixa c = new Caixa();
        Maquineta m = new Maquineta(c);

        c.inicializarPedido(p);
        System.out.print("Informe o valor da transferencia: ");
        double valorInformado = Double.parseDouble(sc.nextLine());
        m.realizarPagamento(p.getPreco(), valorInformado);

    }
}