package ExerciciosPart1;
//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
//decimais.
import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double horasTrabalhadas,valorHora, salario;
        int identificador;

        System.out.println("Qual seu numero identificador?");
        identificador = entrada.nextInt();
        System.out.println("Quantas horas voce trabalhou no mes?");
        horasTrabalhadas = entrada.nextDouble();
        System.out.println("Quanto voce recebe por hora?");
        valorHora = entrada.nextDouble();

        salario = valorHora * horasTrabalhadas;

        System.out.println("Seu numero identificador e: " + identificador);
        System.out.printf("Seu salario e: %.2f", salario);

        entrada.close();
    }
}
