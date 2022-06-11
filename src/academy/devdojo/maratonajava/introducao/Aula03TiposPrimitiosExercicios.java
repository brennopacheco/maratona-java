package academy.devdojo.maratonajava.introducao;

public class Aula03TiposPrimitiosExercicios {
    public static void main(String[] args) {
        String name = "Brenno Pacheco";
        String address = "Dutch avenue, nª1 - Ponta do Farol";
        double salary = 3220.64;
        String receivingDate = "21/05/2022";

        String report = ("I " + name + ", living at the address " +  address + " confirm that I received the salary U$"
                + salary + " on the date " + receivingDate);

        System.out.println(report);
    }
}
