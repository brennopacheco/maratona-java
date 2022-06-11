package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        // Referência de objetos
        // carro1 = carro2;

        carro1.nome = "RAM";
        carro1.modelo = "3.6 e 4x4";
        carro1.ano = 2022;

        carro2.nome = "SW4";
        carro2.modelo = "3.0 e 4x4";
        carro2.ano = 2022;

        System.out.println("Carro 1: " + carro1.nome + " Modelo: " + carro1.modelo + " Ano: " + carro1.ano);
        System.out.println("\nCarro 2: " + carro2.nome + " Modelo: " + carro2.modelo + " Ano: " + carro2.ano);
    }
}
