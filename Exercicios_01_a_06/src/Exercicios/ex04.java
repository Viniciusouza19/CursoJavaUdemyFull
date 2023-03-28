package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Digite o numero do funcionario: ");
            String numberEmployee = input.next();
            System.out.printf("Digite as horas trabalhadas do funcionario numero %s: ",numberEmployee);
            double workedHours = input.nextDouble();
            System.out.printf("Digite o valor que o %s recebe por hora: ",numberEmployee);
            double hourValue = input.nextDouble();
            double calcSalary = workedHours*hourValue;   
            Locale.setDefault(Locale.US);
            System.out.printf("FUNCIONARIO NUMERO: %d%n", numberEmployee);
            System.out.printf("SALARIO: U$ %.2f", calcSalary);
        }
    }
}
