package _repeticao;

import java.util.Scanner;

public class Exercicio_cadastro_usuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String reset = "\u001B[0m";
        String vermelho = "\u001B[31m";
        String verde = "\u001B[32m";
        String azul = "\u001B[34m";
        String preto = "\u001B[30m";
        String amarelo = "\u001B[33m";

        System.out.println("=== Cadastro de Usuários ===");
        System.out.print("Quantos usuários deseja cadastrar? ");
        int quantidade = scanner.nextInt();
        scanner.nextLine(); // consumir a quebra de linha

        // Definindo os campos que serão armazenados
        String[] campos = {"Nome", "Idade", "Endereço" };
        int numCampos = campos.length;

        // Criando a matriz: linhas = quantidade de usuários, colunas = número de campos
        String[][] usuarios = new String[quantidade][numCampos];

        // Preenchimento da matriz
        for (int i = 0; i < quantidade; i++) {
            System.out.println("\n***** Cadastro do usuário ******" + (i+1));
            for (int j = 0; j < numCampos; j++) {
                System.out.print("Digite " + campos[j] + ": ");
                usuarios[i][j] = scanner.nextLine();
            }
        }

        // Exibindo os dados cadastrados
        System.out.println("\n=== Dados Cadastrados ===");
        System.out.println();
        // Cabeçalho
        for (String campo : campos) {
            System.out.printf(verde + "%-15s"+" | " + reset, campo);
        }
        System.out.println();


        // Linhas
        System.out.println("-----------------------------------------------------");
        for (int i = 0; i < quantidade; i++) {
            for (int j = 0; j < numCampos; j++) {
                System.out.printf("%-15s | ", usuarios[i][j]);
            }
            System.out.println();
        }
        System.out.println("-----------------------------------------------------");

        scanner.close();
    }
}
