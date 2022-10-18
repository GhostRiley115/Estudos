package ExerciciosPart1;
//Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C.
import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double a, b, c, triangulo, circulo, trapezio, quadrado, retangulo;

        System.out.println("Informe o primeiro valor A: ");
        a = entrada.nextDouble();
        System.out.println("Informe o segundo valor B: ");
        b = entrada.nextDouble();
        System.out.println("Informe o terceiro valor C: ");
        c = entrada.nextDouble();

        triangulo = (a * c) / 2;
        circulo = 3.14159 * Math.pow(c,2);
        trapezio = ((a + b) * c) / 2;
        quadrado = Math.pow(b,2);
        retangulo = a * b;

        System.out.printf("a area do triangulo retangulo que tem A por base e C por altura: %.3f\n", triangulo);
        System.out.printf("a area do circulo de raio C: %.3f\n", circulo);
        System.out.printf("a area do trapezio que tem A e B por bases e C por altura: %.3f\n", trapezio);
        System.out.printf("a area do quadrado que tem lado B: %.3f\n", quadrado);
        System.out.printf("a area do retangulo que tem lados A e B %.3f\n", retangulo);

        entrada.close();
    }
}
