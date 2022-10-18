package EstruturaControle;

import java.util.Scanner;

public class IfElseIF {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Transformando a nota em formarto Americano");

        System.out.println("Informe sua nota:");
        double nota = entrada.nextDouble();
        
        if(nota <0 || nota >10){
            System.out.println("Nota invalida");
        }
        else if(nota >= 9 && nota <=10){
            System.out.println("Sua nota e A");
        }
        else if(nota >= 7 && nota <9){
            System.out.println("Sua nota e B");
        }
        else if(nota >= 5 && nota <7){
            System.out.println("Sua nota e C");
        }
        else if(nota >= 4.5 && nota <5){
            System.out.println("Sua nota e D");
        }
        else if(nota < 4.5){
            System.out.println("Sua nota e F");
        }
            
        entrada.close();
    }
    
}
