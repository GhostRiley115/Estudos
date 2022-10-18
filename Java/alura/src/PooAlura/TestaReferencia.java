package PooAlura;

public class TestaReferencia {

    public static void main(String[] args) {
        
    Diarista primeirDiarista = new Diarista();
    Diarista segundaDiarista = new Diarista();

    primeirDiarista.valorCobrado = 100;

    segundaDiarista = primeirDiarista;

    System.out.println(primeirDiarista);
    System.out.println(segundaDiarista);

    System.out.println(segundaDiarista.valorCobrado);
    System.out.println(primeirDiarista.valorCobrado);

    if(segundaDiarista == primeirDiarista){
        System.out.println("Estão referenciando o mesmo objeto");
    }

    }
    
}
