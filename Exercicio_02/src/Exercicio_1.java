import java.util.Locale;

public class Exercicio_1 {
    public static void main(String[] args){
        String product1 = "Computador";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.1;
        double price2 = 650.50;
        double measure = 53.23567;

        System.out.println("Produtos:");
        System.out.printf("%s, with price is $ %.2f\n",product1,price1);
        System.out.printf("%s, with price is $ %.2f\n",product2,price2);
        System.out.printf("Record: %d years old, code %d ande gender: %s\n",age,code,gender);
        System.out.println(" ");
        System.out.printf("Measue with eigth decimal places: %f\n",measure);
        System.out.printf("Rouded (three decimal places): %.2f\n",measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.2f%n",measure);
    }
}
