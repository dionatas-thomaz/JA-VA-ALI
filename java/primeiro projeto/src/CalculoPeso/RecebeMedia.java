

import java.util.ArrayList;
import java.util.Scanner;

public class RecebeMedia {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            ArrayList<Double> notas = new ArrayList<Double>();
            double nota;

            for (int i = 0; i < 3; i++) {
                System.out.println("digite uma nota: ");
                nota = sc.nextDouble();
                notas.add(nota);
            }
            Calculo calculo = new Calculo(notas);

            System.out.println(calculo.media);

            if (calculo.media >= 8) {
                System.out.println("nota A");
            }else if (calculo.media >= 7) {
                System.out.println("nota B");
            }else if (calculo.media >= 6) {
                System.out.println("nota C");
            }else if (calculo.media >= 5) {
                System.out.println("nota D");
            }else if (calculo.media >= 4) {
                System.out.println("nota E");
            }
        }
    }
}

