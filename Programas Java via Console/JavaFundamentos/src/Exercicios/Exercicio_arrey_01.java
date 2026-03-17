package Exercicios;

import java.util.Scanner;

public class Exercicio_arrey_01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String [] produtos = {"Smartphone", "Monitor", "Mouse", "Teclado"};


        System.out.println("1. " + produtos[0]);
        System.out.println("2. " + produtos[1]);
        System.out.println("3. " + produtos[2]);
        System.out.println();
        System.out.println(("---Produtos Cadastrados---"));

        String[] nomes1 = new String[3];

        System.out.print("Digite um nome: ");
        nomes1[0] = teclado.nextLine();
        System.out.print("Digite outro nome: ");
        nomes1[1] = teclado.nextLine();
        System.out.print("Digite outro nome: ");
        nomes1[2] = teclado.nextLine();

        System.out.println();
        System.out.println(("---Nomes Cadastrados---"));
        System.out.println("1. " + nomes1[0]);
        System.out.println("2. " + nomes1[1]);
        System.out.println("3. " + nomes1[2]);

    }
}
