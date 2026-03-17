package _swtich;

import java.util.Scanner;

public class Exemplo_swtich_02 {
    public static void main(String[] args) {

        //Exemplo de Aplicação Swtich

        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o mês desejado (1-12): ");
        int mesNum = teclado.nextInt();

        switch (mesNum) {
            case 2:
                System.out.println("O mês tem 28 dias");
            break;
            case 4:
            case 6:
            case 9:
            case 11:
                    System.out.println("O mês tem 30 dias");
                    break;

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("O mês tem 31 dias");
                break;
            default:
                System.out.println("Opção invalida");
        }
    }
}
