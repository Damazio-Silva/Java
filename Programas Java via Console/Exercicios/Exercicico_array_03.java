package Exercicios;

public class Exercicico_array_03 {

    public static void main(String[] args) {
        double[] notas = {8.0, 6.5, 7.5, 9.0, 5.0};
        double soma = 0;
        double media;
        String situacao;

        //Calcular a soma das notas
        soma =  soma + notas[0];  // soma vale 8.0
        soma = soma + notas[1];   // soma vale 14.5
        soma = soma + notas[2];   // soma vale 22.0
        soma = soma + notas[3];   // soma vale 31.0
        soma = soma + notas[4];   // soma vale 36.0

        //Calcular  a media doa aluno
        media = soma / notas.length;

        //Verificar situação do aluno
        if(media >= 7){
            situacao = "Aprovado";
        }
        else{
            situacao = "Reprovado";
        }

        System.out.println("Media do aluno: " + media);
        System.out.println("situacao do aluno: " + situacao);
    }

}
