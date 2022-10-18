package PooAlura;

public class TestaMetodo {

    public static void main(String[] args) {
        Diarista diarista = new Diarista();
        diarista.valorCobrado = 100;
        diarista.pagar(50);
        System.out.println(diarista.valorCobrado);
        
    }
    
}
