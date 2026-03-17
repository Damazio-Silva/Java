package Exercicios;

import java.util.Scanner;

public class Exercico_repeticao_01{
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double saldoInicial = 100.00;
        int opcao = 0;
        double valorSaque = 0;
        double valorDeposito = 0;

        while(opcao != 4){

            System.out.println("1 ➡\uFE0F Sacar dinheiro");
            System.out.println("2 ➡\uFE0F Depositar dinheiro");
            System.out.println("3 ➡\uFE0F Consultar saldo");
            System.out.println("4 ➡\uFE0F Sair");


            System.out.println("Escolha uma opcao: ");
            opcao =  teclado.nextInt();

            if (opcao == 1){

                if(valorSaque <= saldoInicial){
                    System.out.print("Digite um Valor para Saque: \n");
                    valorSaque = teclado.nextDouble();
                    saldoInicial -= valorSaque;

                    System.out.println("Saque realizado com sucesso!");
                }
                else {
                    System.out.println("Saldo insuficiente!");
                }

            }
            else if (opcao == 2){
                System.out.print("Digite um Valor para Deposito: \n");
                valorDeposito = teclado.nextDouble();
                saldoInicial += valorDeposito;


            }
            else if (opcao == 3){
                System.out.println("Valor do saldo atual: " + saldoInicial);

            }
            else {
                System.out.println("Opção Invalida  ");
                System.out.println("Digite uma Opção Validade \n");

            }



        }

        System.out.println("Volte Sempre!!");



    }



}
