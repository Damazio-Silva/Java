package Exercicios;

import java.util.Scanner;

public class Classificar_notas {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);


        System.out.print("Digite a nota do aluno (0 a 100)");
        int nota = teclado.nextInt();

        if(nota >=90){
            System.out.println("Excelente! Aprovado com louvor.");
        } else if (nota >= 70 || nota < 90) {
            System.out.println("Aprovado");
        }else if (nota >= 50 || nota < 70) {
            System.out.println("Recuperação");
        }
        else if(nota < 50){
            System.out.println("Reprovado");
        }
    }
}
