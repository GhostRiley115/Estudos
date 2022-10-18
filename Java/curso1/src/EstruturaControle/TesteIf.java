package EstruturaControle;

import java.util.Scanner;

public class TesteIf {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("informe sua primeira nota:");
        double nota1 = entrada.nextDouble();
        System.out.println("informe sua segunda nota:");
        double nota2 = entrada.nextDouble();
        System.out.println("informe sua terceira nota:");
        double nota3 = entrada.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;
           
        boolean recuperacao = media >= 5 && media < 7;

        if(media >= 7){
            System.out.println("Voce foi aprovado");
        }

        else if(recuperacao){
            System.out.println("Ficou de recuperacao");
        }
        else {
            System.out.println("Reprovado");
        }

        entrada.close();
    }
    
}
