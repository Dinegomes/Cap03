import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double preco, desconto, novoPreco;

        System.out.print("Insira o valor do produto que receberá o desconto: ");
        preco = entrada.nextDouble();

        desconto = preco * 0.1;
        novoPreco = preco - desconto;

        System.out.println("O novo valor é: "+ novoPreco);

        entrada.close();
    }
}