package Exercicios;

import java.util.Scanner;

public class Dia_semana {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("-- Identificador de Dia da Semana ---");

        System.out.print("Digite um número de 1 a 7: ");
        int diaSemana = teclado.nextInt();

        switch (diaSemana) {
            case 1:
                System.out.println("Segunda-Feira");
                break;
                case 2:
                    System.out.println("Tercea-Feira");
                    break;
                    case 3:
                        System.out.println("Quarta-Feira");
                        break;
                        case 4:
                        System.out.println("Quinta-Feira");
                        break;
                        case 5:
                            System.out.println("Sexta-Feira");
                            break;
                            case 6:
                                System.out.println("Saba-Feira");
                                break;
                                case 7:
                                    System.out.println("Domingo");
            default:
                System.out.println("Opção invalida");
        }
    }
}
