package academy.devdojo.maratonajava.javacore.Gassociação.test;

import academy.devdojo.maratonajava.javacore.Gassociação.domain.Escola;
import academy.devdojo.maratonajava.javacore.Gassociação.domain.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Newton");
        Professor professor2 = new Professor("Einsten");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("UFMA", professores);

        escola.imprime();

    }
}
