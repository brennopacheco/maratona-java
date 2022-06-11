package academy.devdojo.maratonajava.javacore.Dconstrutores.test;


import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("One Piece", "TV", 1283, "Ação"); // Com atributos
        anime.imprime();

        System.out.println("----------");

        Anime anime2 = new Anime(); // Sem atritubos, devido ao método de sobrecarga (de construtores)
        anime2.imprime();

        System.out.println("----------");

        Anime anime3 = new Anime("Death Note", "Tv", 37, "Mistério", "Mad House");
        anime3.imprime();
    }
}
