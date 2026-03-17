package _repeticao;

public class Exemplo_for_01 {

    public static void main(String[] args) {

        double[] notas = {8.0, 6.5, 7.5, 9.0, 5.0};
        double soma = 0;
        double media;
        String situacao;

        for (int i= 0; i < notas.length; i++){

           // soma = soma + notas[i];
            soma += notas[i];

        }
        media = soma/notas.length;
        System.out.println("A soma vale: " + soma);


    }
}
