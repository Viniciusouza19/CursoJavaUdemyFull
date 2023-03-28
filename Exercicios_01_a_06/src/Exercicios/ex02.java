package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Locale.setDefault(Locale.US);
            System.out.println("Digite o raio do circulo: ");
            double raio = input.nextDouble();
            double resultado = 3.14159 * (Math.pow(raio, 2));
            System.out.printf("A area do circulo é: %.4f", resultado);
            
        }
    }
}
