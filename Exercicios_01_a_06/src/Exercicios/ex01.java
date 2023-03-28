package Exercicios;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Digite o primeiro numero: ");
            String numberOne = input.nextLine();
            System.out.println("Digite o segundo numero: ");
            String numberTwo = input.nextLine();
            double resultado = Double.parseDouble(numberOne) + Double.parseDouble(numberTwo);
            System.out.println(resultado);
        }
    }
}
