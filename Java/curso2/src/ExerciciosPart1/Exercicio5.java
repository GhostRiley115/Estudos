package ExerciciosPart1;
//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
//código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int codigo, qntd, codigo2, qntd2;
        double valor, valor2, total;

        System.out.println("Digite o codigo do produto");
        codigo = entrada.nextInt();
        System.out.println("Informe a quantidade do produto");
        qntd = entrada.nextInt();
        System.out.println("Informe o valor unitario do produto");
        valor = entrada.nextDouble();

        System.out.println("digite o codigo do segundo produto:");
        codigo2 = entrada.nextInt();
        System.out.println("Digite a quantidade do segundo produto:");
        qntd2 = entrada.nextInt();
        System.out.println("Informe o valor unitario do segundo produto:");
        valor2 = entrada.nextDouble();

        total = valor * qntd + valor2 * qntd2;

        System.out.printf("valor total e: %.2f", total);

        entrada.close();
    }

}
