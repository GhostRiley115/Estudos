package Fundamentos;

import java.util.Scanner;

public class ExercicioImc {

    public static void main (String args[]){

        Scanner entrada = new Scanner(System.in);

        double altura;
        double peso;
        double imc;

        System.out.println("Digite sua altura:");
        altura = entrada.nextDouble();

        System.out.println("Agora digite seu peso:");
        peso = entrada.nextDouble();

        imc = peso / (altura * altura);

        System.out.println("Seu imc e:" + imc);

        entrada.close();

    }
    
}
