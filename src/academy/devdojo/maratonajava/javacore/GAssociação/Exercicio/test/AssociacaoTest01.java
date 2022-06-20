package academy.devdojo.maratonajava.javacore.GAssociação.Exercicio.test;

import academy.devdojo.maratonajava.javacore.GAssociação.Exercicio.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.GAssociação.Exercicio.dominio.Local;
import academy.devdojo.maratonajava.javacore.GAssociação.Exercicio.dominio.Professor;
import academy.devdojo.maratonajava.javacore.GAssociação.Exercicio.dominio.Seminario;

public class AssociacaoTest01 {
    public static void main(String[] args) {
        Local local = new Local("Av dos Holandeses");
        Estudante estudante = new Estudante("Brenno", 25);
        Professor professor = new Professor("William", "Programação");

        Estudante[] estudantesSeminario = {estudante};

        Seminario seminario = new Seminario("Progamação Java", estudantesSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}
