import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double num1, num2, resultado;

        System.out.print("Informe o primeiro número da divisão: ");
        num1 = entrada.nextDouble();
        System.out.print("Informe o segundo número: ");
        num2 = entrada.nextDouble();

        resultado = num1/num2;

        System.out.println("O resultado da divisão é: "+ resultado);

        entrada.close();
    }
}
