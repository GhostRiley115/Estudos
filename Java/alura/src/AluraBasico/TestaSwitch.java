package BasicoAlura;

import java.util.Scanner;

public class TestaSwitch {
   
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero;

        System.out.print("Escolha um número de 1 a 10:");
        numero = entrada.nextInt();

        entrada.close();

        switch (numero) {
            case 1:
            System.out.println("Opcao 1");
            break;
            case 2:
            System.out.println("Opcao 2");
            break;
            case 3:
            System.out.println("Opcao 3");
            break;
            case 4:
            System.out.println("Opcao 4");
            break;
            case 5:
            System.out.println("Opcao 5");
            break;
            case 6:
            System.out.println("Opcao 6");
            break;
            case 7:
            System.out.println("Opcao 7");
            break;
            case 8:
            System.out.println("Opcao 8");
            break;
            case 9:
            System.out.println("Opcao 9");
            break;
            case 10:
            System.out.println("Opcao 10");
            break;
            default:
            System.out.println("opção invalida");
            break;
        }
        
    }
    
}
