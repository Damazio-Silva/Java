package _repeticao;

import java.util.Scanner;

public class Exemplo_while_01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String lider = "Sâo Paulo";

        while (lider.equals("São Paulo")){
            System.out.println("Quem é o Lider");
            lider = teclado.next();
        }

    }
}
