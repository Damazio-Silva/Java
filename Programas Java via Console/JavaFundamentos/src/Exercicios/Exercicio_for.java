package Exercicios;

import java.util.Scanner;

public class Exercicio_for {
    public static void main(String[] args) {

        double[] notas =  new double[3];
        double soma = 0;
        double media;


        Scanner teclado = new Scanner(System.in);
        /*
        System.out.print("Digite a nota 1: ");
        notas[0] = teclado.nextFloat();
        System.out.print("Digite a nota 2: ");
        notas[1] = teclado.nextFloat();
        System.out.print("Digite a nota 3: ");
        notas[2] = teclado.nextFloat();

         */
        System.out.println("===============================");
        System.out.println("       Calcule a Média         ");
        System.out.println("===============================");

        for (int i = 0; i < notas.length; i++){
            System.out.print("Digite a Nota " + (i+1) + ": ");
            notas[i] = teclado.nextDouble();

               soma += notas[i];
        }
        media = soma /notas.length;

        System.out.println("======Rsultado da Média======");
        System.out.println("Média das notas: " + media);
    }



}
