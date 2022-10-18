package Fundamentos;

import java.util.Scanner;

public class ExercicioBhaskara {
    
    public static void main (String args[]){

        Scanner entrada = new Scanner(System.in);
 
     System.out.println("Formula de Bhaskara");
     System.out.println("Vamos descobrir o valor de X");

     System.out.println("Digite o valor de A:");
     double a = entrada.nextDouble();
     System.out.println("Digite o valor de B:");
     double b = entrada.nextDouble();
     System.out.println("Digite o valor de C:");
     double c = entrada.nextDouble();
     
     double raiz = b * b - 4 * a * c;
     double delta = Math.sqrt(raiz);
     double divisao = 2 * a;
     double x1 = (- b + delta) / divisao;
     double x2 = (-b - delta) / divisao;
 
     System.out.println("O valor de delta é:" + delta);
     System.out.println("O valor de x é: -" + b + " +- " + delta + " / " + divisao);
     System.out.println("O valor de x1 é:" + x1);
     System.out.println("O valor de x2 é:" + x2);
     
     entrada.close();
    }
}
