package PooAlura;

public class MainDiarista {

    public static void main(String[] args) {
        Diarista primeiraDiarista = new Diarista();
        primeiraDiarista.nome = "Elisangela";
        System.out.println(primeiraDiarista.nome);

        primeiraDiarista.nome += " Sardinha";
        

        Diarista segundaDiarista = new Diarista();
        segundaDiarista.nome = "Elisangela";
        segundaDiarista.nome += " Sardinha";

        
        System.out.println(primeiraDiarista.nome);
        System.out.println(segundaDiarista.nome);

        if(primeiraDiarista == segundaDiarista){
        System.out.println("Estão referenciando o mesmo objeto");
        }else{
            System.out.println("São referencia a contas diferentes, os valores"
            + " são iguais mas as contas não");
        }
        System.out.println(primeiraDiarista);
        System.out.println(segundaDiarista);
        
    }
    
}
