package ClassesMetodos;

public class DataTeste {

    public static void main(String[] args) {

        DesafioClasseData data1 = new DesafioClasseData();
        data1.ano = 2022;
        data1.mes = 7;
        data1.dia = 31;

        DesafioClasseData data2 = new DesafioClasseData();
        data2.dia = 28;
        data2.mes = 11;
        data2.ano = 1999;

        System.out.println("estamos no dia " + data1.dia);
        System.out.println("do mes " + data1.mes);
        System.out.println("no ano de " + data1.ano);
        System.out.println("eu nasci no dia " + data2.dia);
        System.out.println("do mes " + data2.mes);
        System.out.println("no ano " + data2.ano);
    }
}
