package academy.devdojo.maratonajava.javacore.Eblocoinicializacao.test;

import academy.devdojo.maratonajava.javacore.Eblocoinicializacao.domain.Cliente;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente c = new Cliente();

        System.out.println("Exibindo quantidade de parcelas possiveis");
        for (int parcela : c.getParcelas()) {
            System.out.print(parcela + " ");
        }
    }
}
