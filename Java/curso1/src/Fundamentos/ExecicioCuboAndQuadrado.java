package Fundamentos;

import java.util.Scanner;

public class ExecicioCuboAndQuadrado {

    public static void main (String args[]){

        Scanner entrada = new Scanner(System.in);

        double numero;
        double quadrado;
        double cubo;

        System.out.println("Digite um número:");
        numero = entrada.nextDouble();

        quadrado = numero * numero;
        cubo = numero * numero * numero;
        
        System.out.println("O valor do seu número ao quadrado é:" +quadrado+ " e ao cubo é:" +cubo);

        entrada.close();
    }
    
}
