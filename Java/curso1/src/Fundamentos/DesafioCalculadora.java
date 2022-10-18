package Fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
    //ler número 1
    //ler número 2
    //usuário informar a operação - + * / %
    //usar a operação que o usuário informou
    //imprimir resultado
    
    public static void main(String args[]){

        Scanner entrada = new Scanner(System.in);
        
        //Variáveis
        double num1;
        double num2;
        String operacao;
                
        //Entrada
            System.out.println("Digite o primeiro numero:");
            num1 = entrada.nextDouble();
            System.out.println("Agora digite a operacao desejada:");
            operacao = entrada.next();
            System.out.println("Digite o segundo numero:");
            num2 = entrada.nextDouble();
            
            
            entrada.close(); 
             
        //Lógica
            double resultado = "+".equals(operacao) ? num1 + num2 :
                               "*".equals(operacao) ? num1 * num2 :
                               "-".equals(operacao) ? num1 - num2 :
                               "/".equals(operacao) ? num1 / num2 :
                               "%".equals(operacao) ? num1 % num2 : 0;
        
        //Saída    
            System.out.println("O resultado dessa operacao e: " + resultado);
            
            entrada.close();    
    }
    
}
