package EstruturaControle;
import java.util.Scanner;

public class WhileDesafio {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int quantidadeNota = 0;
        double nota = 0, total = 0;

        while(nota != -1){
            System.out.println("digite uma nota:");
            nota = entrada.nextDouble();
            if(nota <=10 && nota >=0 ) {
                quantidadeNota++;
                total = nota + total;
            }
            else if(nota != -1){
                System.out.println("nota invalida");
            }
        }
        double media = total / quantidadeNota;
        System.out.println("A quantidade de notas inseridas foi: " + quantidadeNota);
        System.out.println("O total das nota e: " + total);
        System.out.printf("A media das notas e: %.2f", media);
        entrada.close();
    }
}
