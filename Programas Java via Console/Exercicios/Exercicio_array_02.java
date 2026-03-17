package Exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio_array_02 {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#,##,0.00");
        Scanner leitor = new Scanner(System.in);
        double[] temperaturas = new double[7];


        System.out.println("Aramazenando Temperaturas da Semana");
        System.out.print("Temeratura 1: ");
        temperaturas[0] = leitor.nextDouble();
        System.out.print("Temeratura 2: ");
        temperaturas[1] = leitor.nextDouble();
        System.out.print("Temeratura 3: ");
        temperaturas[2] = leitor.nextDouble();
        System.out.print("Temeratura 4: ");
        temperaturas[3] = leitor.nextDouble();
        System.out.print("Temeratura 5: ");
        temperaturas[4] = leitor.nextDouble();
        System.out.print("Temeratura 6: ");
        temperaturas[5] = leitor.nextDouble();
        System.out.print("Temeratura 7: ");
        temperaturas[6] = leitor.nextDouble();

        double media = (temperaturas[0] + temperaturas[1] + temperaturas[2] +
                temperaturas[3] +  temperaturas[4] + temperaturas[5] +
                temperaturas[6] ) / 7;

        System.out.println("---Média das Temperaturas da Semana---");


        System.out.println("Media: " +df.format(media) + "°C");

        //System.out.printf("Média: %.2f", media);

    }



}
