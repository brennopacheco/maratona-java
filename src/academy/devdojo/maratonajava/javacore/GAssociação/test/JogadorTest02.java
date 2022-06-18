package academy.devdojo.maratonajava.javacore.GAssociação.test;

import academy.devdojo.maratonajava.javacore.GAssociação.domain.Jogador;
import academy.devdojo.maratonajava.javacore.GAssociação.domain.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Neymar");
        Time time = new Time("PSG");

        jogador1.setTime(time);
    }
}
