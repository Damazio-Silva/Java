package _repeticao;

import java.util.Scanner;

public class Exemplo_foreach {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] cestaFrutas = {"Maça", "Banana", "Laranja"};
        double[] notas = new double [3];
        double soma = 0;
        double media = 0;


        for(String fruta : cestaFrutas){
            System.out.println(fruta);
        }

        for (double nota : notas){
            System.out.print("digite um numero: ");
            nota = input.nextDouble();
            soma += nota;

        }
        media = soma/notas.length;
        System.out.println(media);

    }
}
