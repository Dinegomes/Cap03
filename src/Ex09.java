import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double baseMaior, baseMenor, altura, area;

        System.out.print("Informe a base maior do trapézio: ");
        baseMaior = entrada.nextDouble();
        System.out.print("Informe sua base menor: ");
        baseMenor = entrada.nextDouble();
        System.out.print("Informe sua altura: ");
        altura = entrada.nextDouble();

        area = ((baseMaior + baseMenor) * altura) /2;

        System.out.print("A área total desse trapézio é: "+ area);

        entrada.close();
    }
}