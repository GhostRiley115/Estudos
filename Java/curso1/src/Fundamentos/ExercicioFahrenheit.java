package Fundamentos;

import java.util.Scanner;

public class ExercicioFahrenheit {
    public static void main(String args[]){

        Scanner entrada = new Scanner(System.in);

        double celsius;
        double fahrenheit;

        System.out.println("Digite quantos graus está em Celsius:");
        celsius = entrada.nextDouble();

        fahrenheit = (celsius * 1.8) + 32;

        System.out.println("A temperatura de " + celsius + " Celsius em Fahrenheit é: " + fahrenheit);

    entrada.close();

    }
}
