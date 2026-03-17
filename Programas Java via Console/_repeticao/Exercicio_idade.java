package _repeticao;

import java.util.Scanner;

public class Exercicio_idade {

    public static void main(String[] args) {

         String reset = "\u001B[0m";
         String vermelho = "\u001B[31m";
         String verde = "\u001B[32m";
         String azul = "\u001B[34m";
         String preto = "\u001B[30m";
         String amarelo = "\u001B[33m";



        //System.out.println(ANSI_RED + "Este texto é vermelho" + ANSI_RESET);
       // System.out.println(ANSI_GREEN + "Este texto é verde" + ANSI_RESET);


        int idade = 0;

        System.out.println(amarelo + "=============================================" + reset);
        System.out.println("*" + verde +" Programa que Armazena idade entre 18 e 65 "+ reset +"*");
        System.out.println(amarelo + "=============================================\n" +reset);

        do {
            idade = IdadeUsuario(idade);

        }while (idade < 18 || idade > 65 );

        System.out.println(verde + "Idade registrada com sucesso: " + reset + idade );

    }
    public static int IdadeUsuario(int idade){
        String reset = "\u001B[0m";
        String vermelho = "\u001B[31m";
        String verde = "\u001B[32m";
        String azul = "\u001B[34m";
        String preto = "\u001B[30m";
        String amarelo = "\u001B[33m";

        Scanner teclado =  new Scanner(System.in);
        idade = 0;

        System.out.print(azul + "Digite sua Idade: " + reset);
        idade = teclado.nextInt();


        if (idade < 18 || idade > 65){
            System.out.println(vermelho + "Idade inválida. A idade deve estar entre 18 e 65 anos." + reset);
        }
        return idade;

    }
}
