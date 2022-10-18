package Fundamentos;

import java.util.Scanner;

public class ExercicioOperadorAritmetico {
    public static void main(String args[]){
        
        Scanner entrada = new Scanner(System.in);
        
        String salario1,salario2,salario3;
       
        System.out.println("Informe seu salario dos ultimos 3 meses:");
        salario1 = entrada.nextLine().replace(",", ".");
        salario2 = entrada.nextLine().replace(",", ".");
        salario3 = entrada.nextLine().replace(",", ".");
        
        double salarioDecimall = Double.parseDouble(salario1);
        double salarioDecimal2 = Double.parseDouble(salario2);
        double salarioDecimal3 = Double.parseDouble(salario3);
        double salarioTotal = salarioDecimall + salarioDecimal2 + salarioDecimal3;
        
        System.out.println("A soma dos seus ultimos salarios e: " + salarioTotal);
        
        double salarioMedia = salarioTotal / 3;
        
        System.out.println("A media do seu salario e: " + salarioMedia);
        
        entrada.close();
    }   
    
}
