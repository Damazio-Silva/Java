package Exercicios;

import java.util.Scanner;

public class Atividade_condicional_05_v2 {

    public static void main(String[] args) {

        double valorDaCompra;
        double valorDesconto;
        double porcentagemDesconto = 0;
        double valorFinal;
        boolean possuiCartao = false;


        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor da compra: ");
        valorDaCompra = teclado.nextDouble();


        System.out.println("Cliente tem cartao fidelidade? (SIM/NAO)");
        String resposta = teclado.next();


        if(resposta.equals("SIM")){
            possuiCartao = true;
        }
        if(possuiCartao){
            if(valorDaCompra >= 100){
                porcentagemDesconto = 15;
            }
            else{
                porcentagemDesconto = 10;
            }
        }
        else{
            if(valorDaCompra >= 100){
                porcentagemDesconto = 10;
            }
            else{
                porcentagemDesconto = 5;
            }
        }



        valorDesconto = valorDaCompra * porcentagemDesconto / 100;
        valorFinal = valorDaCompra - valorDesconto;

        System.out.println("Cartão fidelidade =  " + resposta);
        System.out.println("Valor da compra = R$ " + valorDaCompra);
        System.out.println("Desconto = " + porcentagemDesconto + "%");
        System.out.println("Valor do desconto = R$ " + valorDesconto);
        System.out.println("Valor final = R$ " + valorFinal);


    }
}
