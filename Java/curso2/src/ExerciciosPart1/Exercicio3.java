package ExerciciosPart1;
//Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
//de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double diferenca;

        System.out.println("Digite o primeiro valor:");
        double a = entrada.nextDouble();
        System.out.println("Digite o segundo valor:");
        double b = entrada.nextDouble();
        System.out.println("Digite o terceiro valor:");
        double c = entrada.nextDouble();
        System.out.println("Digite o quarto valor:");
        double d = entrada.nextDouble();

        diferenca = (a * b) - (c * d);

        System.out.printf("%.2f", diferenca);

        entrada.close();
    }
}
