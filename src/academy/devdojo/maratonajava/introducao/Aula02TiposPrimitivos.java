package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main (String[] args) {
        // int, double, float, char, byte, short, long, boolean

        // para criar variaveis em Java, primeiro declaramos o seu tipo e em seguida um nome (camelCase)
        int age = 25;
        long bigNumber = 1000000;
        double salaryDouble = 2000.0;
        float salaryFloat = 2500.0F; // o f no final especifica para o copilador que o tipo é float e que há espaço na memoria para ele
        byte ageByte = 10;
        short ageShort = 32000;
        boolean truly = true;
        boolean falsely = false;
        char caracter = 'A'; // não pode usar mais de UM caracter

        // String não é um tipo primitivo, mas sim um tipo de referência.
        String name = "Brenno Pacheco";

        System.out.println("My age on 5/21/2022 is " + age + " years old");
        System.out.println(truly);
        System.out.println(caracter);
        System.out.println(name);
    }
}
