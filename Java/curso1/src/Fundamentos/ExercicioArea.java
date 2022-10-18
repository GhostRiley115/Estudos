package Fundamentos;

import java.util.Scanner;

public class ExercicioArea {

    public static void main (String args[]){

    Scanner entrada = new Scanner(System.in);

    double altura;
    double base;
    double area;

    System.out.println("Qual a altura do triangulo?");
    altura = entrada.nextDouble();
    System.out.println("E qual a base?");
    base = entrada.nextDouble();

    area = (base * altura) / 2;

    System.out.println("A área do triangulo é: " + area);

    entrada.close();

  }
}
