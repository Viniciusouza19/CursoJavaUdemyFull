import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        int y = 32;
        double x = 10.35784;
        System.out.println(y);
        System.out.printf("%.2f%n",x);
        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n",nome,idade,renda);
    }
}