package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Digite o codigo da peça: ");
            String codePeca = input.next();
            System.out.printf("Digite a quantidade da peça %s: ",codePeca);
            double quantidade = input.nextDouble();
            System.out.printf("Digite o valor unitario da peça: ",codePeca);
            double valuePeca = input.nextDouble();
            double calcTotalPrice = valuePeca*quantidade; 
            System.out.print("\nDigite o codigo da segunda peça: ");
            String codePeca2 = input.next();
            System.out.printf("Digite a quantidade da peça %s: ",codePeca2);
            double quantidade2 = input.nextDouble();
            System.out.printf("Digite o valor unitario da peça: ",codePeca2);
            double valuePeca2 = input.nextDouble();
            double calcTotalPrice2 = valuePeca2*quantidade2;    
            Locale.setDefault(Locale.US);
            System.out.printf("\nVALOR TOTAL 1: R$ %.2f%n", calcTotalPrice);
            System.out.printf("VALOR TOTAL 2: R$ %.2f", calcTotalPrice2);
        }
    }
}
