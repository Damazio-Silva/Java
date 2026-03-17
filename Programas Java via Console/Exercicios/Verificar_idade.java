package Exercicios;

import java.util.Scanner;

public class Verificar_idade {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);


        System.out.print("Digite sua idade: ");
        int idade = teclado.nextInt();

        if (idade >= 18) {
            System.out.println("Você pode dirigir");
        }
        else {
            System.out.println("Você não pode dirigir");
        }

    }
}
