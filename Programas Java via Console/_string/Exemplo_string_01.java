package _string;

import java.util.Scanner;

public class Exemplo_string_01 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String nome = "Gabriel";

        String sobreNome = "Lima";

        String nomeCompleto = "Gabriel Lima";
        String nomeCompleto2 = (nomeCompleto + " " + sobreNome);

        System.out.println(nomeCompleto );
        System.out.println(nomeCompleto2);

        System.out.println("Compara de String com .equals");
        System.out.println(nomeCompleto.equals(nomeCompleto2));

        //Qual é a primeira letra?
        System.out.println("Primeira letra do nome: ");
        System.out.println(nomeCompleto.charAt(0));

        System.out.println("Tamanho da String: ");
        System.out.println(nomeCompleto.length());

        System.out.println(nomeCompleto.startsWith(""));

        String[] nomes = nomeCompleto.split(" ");
        System.out.println(nomes[0]);
        System.out.println(nomes[1]);

        String pessoa1 = "Fulano";
        String pessoa2 = "Ciclano";

        System.out.print("Pessoa 1 é igual a pessoa 2? ");
        System.out.println(pessoa1 == pessoa2);

        pessoa1 = pessoa2;

        System.out.print("Pessoa 1 é igual a pessoa 2? ");
        System.out.println(pessoa1 == pessoa2);





    }
}
