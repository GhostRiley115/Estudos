package Fundamentos;

public class ExercicioLogico {
    public static void main(String[] args) {
        boolean trabalhoTerca = false;
        boolean trabalhoQuinta = false;
        
        boolean tv50 = trabalhoTerca & trabalhoQuinta;
        boolean tv32 = trabalhoTerca ^ trabalhoQuinta;
        boolean tomeisorvete = trabalhoTerca || trabalhoQuinta;
        //unario
        boolean saudavel = !tomeisorvete;
        
        System.out.println("Vou comprar uma tv de 50 polegadas? " + tv50);
        
        System.out.println("Vou comprar uma tv de 32 polegadas? " + tv32);
        
        System.out.println("Vamos tomar um sorvete? " + tomeisorvete);
        
        System.out.println("fiquei saudavel? " + saudavel);
        
    }
    
}
