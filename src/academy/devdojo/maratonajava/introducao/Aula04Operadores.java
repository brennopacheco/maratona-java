package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int number01 = 10;
        int number02 = 20;
        int resultado = number02 + number01;

        System.out.println(number02 - number01);
        System.out.println(number02 + number01);
        System.out.println(number02 + number01 + " A partir de agora ele ira concatenar" + number02 + number01);
        System.out.println(resultado);
        System.out.println((number01 / number02) + " Divisão inteiro (10/20)");
        System.out.println(number01 / (double) number02 + " Divisão double (10/20) (fazendo casting)");

        System.out.println("____________________________________________________________________________________________");
        // % (resto)
        int resto01 = 20 % 2;
        int resto02 = 21 % 2;
        System.out.println(resto01);
        System.out.println(resto02);

        System.out.println("____________________________________________________________________________________________");
        // < > <= >= == !=
        boolean isTenGreaterThanTwenty = 10 > 20;
        boolean isTenLessThanTwenty = 10 < 20;
        boolean isTenEqualsTwenty = 20 == 10;
        boolean isTenEqualsTen = 10 == 10;
        boolean isTenDifferentTen = 10 != 10;
        System.out.println("isTenGreaterThanTwenty? " + isTenGreaterThanTwenty);
        System.out.println("isTenLessThanTwenty? " + isTenLessThanTwenty);
        System.out.println("isTenEqualsTwenty? "+ isTenEqualsTwenty);
        System.out.println("isTenEqualsTen? " + isTenEqualsTen);
        System.out.println("isTenDifferentTen? " + isTenDifferentTen);

        System.out.println("____________________________________________________________________________________________");
        // and (&&) or (||) not (!)
        int age = 25;
        float salary = 3500F;

        boolean isInTheLawGreaterThirty = (age > 30) && (salary > 4612);
        boolean isInTheLawLessThirty = (age < 30) && (salary > 3381);
        System.out.println("isInTheLawGreaterThirty? " + isInTheLawGreaterThirty);
        System.out.println("isInTheLawLessThirty? " + isInTheLawLessThirty);


        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupança = 10000;
        float valorPlaystation = 5000F;

        boolean isPlayStationCincoCompravel = (valorTotalContaCorrente > valorPlaystation) || (valorTotalContaPoupança >valorPlaystation);
        System.out.println("isPlayStationCincoCompravel? " + isPlayStationCincoCompravel);

        System.out.println("____________________________________________________________________________________________");
        // atribuição: =, +=, -=, *=, /=, %=

        double bonus = 1800;
        // bonus = bonus + 1000;
        bonus += 1000;
        System.out.println("bonus? " + bonus);

        System.out.println("____________________________________________________________________________________________");
        // incremento ++, --

        int contador = 0;
        contador ++;
        System.out.println("contador " + contador);
        contador--;
        System.out.println("contador " + contador);
    }
}