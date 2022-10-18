package EstruturaControle;

//Desafio: Encontre o bug e descubra o porquê do if ser executado mesmo sem a nota ter satisfeito a condição dele. 

public class DesafioIF {
    public static void main(String[] args) {
        
        double nota = 1.3;
        
        /**O erro está no ";" após a condição do if, fazendo o código terminar na condição e o resto do código,
        no caso o print, está idependente da condição de if**/
        if(nota >= 9.0); {
            System.out.println("Quadro de honra!");
            System.out.println("Voce e fera!!!");
        }
        
    }
}
