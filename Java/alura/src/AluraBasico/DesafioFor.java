package BasicoAlura;

public class DesafioFor {

    public static void main(String[] args) {
        
    

    for(int piramide = 0; piramide < 5; piramide++){
        for(int coluna = 0; coluna < 5; coluna++){
            if(coluna > piramide){
            break;
            }
            System.out.print(coluna + 1);
        }
        System.out.println();
    }
  } 
}
