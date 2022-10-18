package BasicoAlura;

public class TabuadaFor {
    
    public static void main(String[] args) {

        //quando o segundo for acabar e pular a linha vai incrementar 1 na variável multiplicador
        for(int multiplicador = 1; multiplicador <=10; multiplicador++){

            //primeiro vai fazer o numero do segundo for chegar até o 10 e ir multiplicando ao decorrer
            for(int numero = 1; numero <=10; numero++){
                System.out.print(multiplicador * numero);
                System.out.print(" ");
            }
            
            //vai pular a linha quando o segundo for acabar
            System.out.println();
        }
    }
    
}
