package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Digite o numero A: ");
            double a = input.nextDouble();
            System.out.print("Digite o numero B: ");
            double b = input.nextDouble();
            System.out.print("Digite o numero C: ");
            double c = input.nextDouble();
            System.out.print("Digite o numero D: ");
            double d = input.nextDouble();
            String diferenca = String.valueOf((a*b)-(c*d));
            Locale.setDefault(Locale.US);
            System.out.printf("A diferença entre (a*b)-(c*d) é: %s",diferenca);
            
        }
    }
}
