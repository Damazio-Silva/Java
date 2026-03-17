package Exercicios;

import java.util.Scanner;

public class Exercicio_repeticao_02 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int estoqueAtual = 50;
        int estoqueMinimo = 15;
        int descontoVenda = 5;
        int vendas = 0;

        for (int venda = 0; venda < 10; venda++) {
            estoqueAtual -= descontoVenda;
            System.out.print(" Venda " + (venda + 1) + ". Estoque Atual: " + estoqueAtual);


            if(estoqueAtual <= estoqueMinimo && estoqueAtual > 0) {
                System.out.println(" => \uD83D\uDEA8 ALERTA! Estoque baixo  ");
            }
            else if (estoqueAtual == 0) {
                System.out.println(" => ❌ ESTOQUE ESGOTADO! ");
            }
            else {
                System.out.println();
            }


        }

        //Metodo Alerta






    }


}
