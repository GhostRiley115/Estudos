package ExerciciosPart1;
//Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
//casas decimais conforme exemplos.
//Fórmula da área: area = π . raio2
//Considere o valor de π = 3.14159

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double raio, area, pi = 3.14159;

        System.out.println("Informe o valor do raio do circulo:");
        raio = entrada.nextDouble();

        area = pi * (raio * raio);

        System.out.printf("A area do circulo e: %.4f", area);

        entrada.close();
    }
}
