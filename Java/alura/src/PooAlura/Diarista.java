package PooAlura;

public class Diarista {
    int idade;
    double valorCobrado;
    String nome;
    String endereco;

    public void pagar(double valor){
    this.valorCobrado = this.valorCobrado + valor;

    }
}
