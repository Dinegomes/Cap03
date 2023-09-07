import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double pesoKg, pesoGramas;

        System.out.println("Insira o peso(em kg): ");
        pesoKg = entrada.nextDouble();

        pesoGramas = pesoKg * 1000;

        System.out.println("O peso em gramas é: "+ pesoGramas);

        entrada.close();
    }
}
