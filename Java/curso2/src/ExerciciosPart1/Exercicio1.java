package ExerciciosPart1;
//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
//mensagem explicativa, conforme exemplos.

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int num1, num2,resultado;

        System.out.println("Informe o primeiro valor:");
        num1 = entrada.nextInt();
        System.out.println("informe o segundo valor:");
        num2 = entrada.nextInt();
        resultado = num1 + num2;

        System.out.println("O primeiro numero: " +num1+ " + o segundo numero: " +num2+ " e igual a: " +resultado);

        entrada.close();
    }
}
