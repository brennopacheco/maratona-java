package academy.devdojo.maratonajava.javacore.GAssociação.test;

import academy.devdojo.maratonajava.javacore.GAssociação.domain.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Neymar");
        Jogador jogador2 = new Jogador("Vini Jr");
        Jogador jogador3 = new Jogador("Arrascaeta");


        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }

    }
}
