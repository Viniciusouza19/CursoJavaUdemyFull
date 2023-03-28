package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Digite o A: ");
            double a = input.nextDouble();
            System.out.print("Digite o B: ");
            double b = input.nextDouble();
            System.out.print("Digite o C: ");
            double c = input.nextDouble();
            double trianguloRetangulo = (a*c)/2;
            double circulo = 3.14159 * (c*c);
            double trapezio = (a+b)/2;
            double quadrado = b*4;
            double retangulo = a*b;
            Locale.setDefault(Locale.US);
            System.out.printf("\nTRAINGULO: %.3f\nCIRCULO: %.3f\nTRAPEZIO: %.3f\nQUADRADO: %.3f\nRETANGULO: %.3f",trianguloRetangulo,circulo,trapezio,quadrado,retangulo);
        }
    }
}
