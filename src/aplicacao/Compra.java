package aplicacao;

import java.util.Scanner;

public class Compra {

    CompraModel compra;
    Calculo desc;

    public void RealizarCompra() {
        compra = new CompraModel();

        Scanner dados = new Scanner(System.in);
        System.out.print("Informe o valor da compra: ");
        compra.setValor(dados.nextInt());

        System.out.print("Informe a Idade: "); 
        compra.setIdade(dados.nextInt());

        desc = new Calculo();
        compra.setDesconto(desc.calcularDesconto(compra.getValor(), compra.getIdade()));
        compra.setTotal(desc.calculartotal(compra.getValor(), compra.getDesconto()));

        System.out.println("Valor do desconto: " + compra.getDesconto());
        System.out.println("Valor a pagar:     " + compra.getTotal());
        System.out.println("tESTE");
        System.out.println("Oi");
        System.out.println("Mensagem do Arthur");
        System.out.println("Engenharia de Software");
        System.out.println("Teste Leonardo");
        System.out.println("Frutal");
    }
}
