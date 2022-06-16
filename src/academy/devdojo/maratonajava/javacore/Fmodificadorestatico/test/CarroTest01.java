package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.test;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.domain.Carro;

public class CarroTest01 {
    /*
    * Modificador de acesso estático - irá fazer o atributo pertencer à classe
    * e todos os objetos vão compartilhar o mesmo valor.
    * */
    public static void main(String[] args) {
        Carro.setVelocidadeLimite(180); // estamos mudando a velocidadeLimite para todos as instâncias da classe Carro

        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Mercedes", 275);
        Carro c3 = new Carro("Audi", 290);

//        c1.setVelocidadeLimite(180); estariamos mudando a velocidade limite para apenas 1 objeto

        c1.imprime();
        c2.imprime();
        c3.imprime();

    }
}
