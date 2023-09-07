import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double num1, num2, num3, resultado;

        System.out.print("Informe o primeiro numero da multiplicação: ");
        num1 = entrada.nextDouble();
        System.out.print("Informe o segundo número: ");
        num2 = entrada.nextDouble();
        System.out.print("Informe o terceiro e último número e veja o resultado da multiplicação: ");
        num3 = entrada.nextDouble();

        resultado = num1*num2*num3;

        System.out.println("O resultado da multiplicação dos números é: "+ resultado);

        entrada.close();
    }
}
