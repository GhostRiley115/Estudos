package EstruturaControle;

import java.util.Scanner;

//ler o dia da semana e retornar o numero referente ao dia

public class DesafioDiaSemana {

    public static void main(String[] args) {
        
    Scanner entrada = new Scanner(System.in);

    System.out.println("Informe o dia da semana:");
    String semana = entrada.nextLine();

    if("domingo".equalsIgnoreCase(semana)){
        System.out.println("Domingo e o numero 1");
    }
    else if("segunda".equalsIgnoreCase(semana)){
        System.out.println("Segunda e o numero 2");
    }
    else if("terça".equalsIgnoreCase(semana) || "terca".equalsIgnoreCase(semana)){
        System.out.println("Terça e o numero 3");
    }
    else if("quarta".equalsIgnoreCase(semana)){
        System.out.println("Quarta e o numero 4");
    }
    else if("quinta".equalsIgnoreCase(semana)){
        System.out.println("Quinta e o numero 5");
    }
    else if("sexta".equalsIgnoreCase(semana)){
        System.out.println("Sexta e o numero 6");
    }
    else if("sábado".equalsIgnoreCase(semana) || "sabado".equalsIgnoreCase(semana)){
        System.out.println("Sabado e o numero 7");
    }
    else{
        System.out.println("dia invalido");
    }
    entrada.close();
}

}