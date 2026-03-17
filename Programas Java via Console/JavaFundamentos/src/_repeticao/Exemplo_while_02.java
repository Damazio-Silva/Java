package _repeticao;

public class Exemplo_while_02 {
    public static void main(String[] args) {

        double[] receita = {10.0, 45.0, 98.5};
        double receitaTotal = 0;


        int i = 0;

        while (i < 3) {
            receitaTotal += receita[i];

            i++;

        }
        System.out.println("O receita foi: " + receitaTotal);
    }
}
