package Fundamentos;

public class ExercicioConversao {
       
    public static void main(String[] args) {
        
        var esquerda = Math.pow((6*(3+2)),2)/(3*2);
        var direita = Math.pow((1-5)*(2-7)/2 ,2);
        var cima = Math.pow((esquerda - direita),3);
        var baixo = Math.pow(10, 3);
        var total = cima / baixo;
  
        System.out.println(""+ esquerda);
        System.out.println(""+ direita);
        System.out.println(""+ cima);
        System.out.println(""+baixo);
        System.out.println(""+ total);
       }
}
