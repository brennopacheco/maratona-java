package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int age = 20;
        boolean isAllowedToBuyAlcoholicDrink = age >= 18;


        if (isAllowedToBuyAlcoholicDrink != false) {
            System.out.println("Allowed to buy alcoholic drink");
        } else {
            System.out.println("Not allowed to buy alcoholic drink");
        }

        /*
        vale lembrar que as duas concições abaixo se igualam
            // isAllowedToBuyAlcoholicDrink == false
        if (!isAllowedToBuyAlcoholicDrink) {
            System.out.println("Not allowed to buy alcoholic drink");
        }

        algo que nunca deve ser feito!!!
        boolean c = false;
        if (c = true) {
            System.out.println("Inside something that never must be done");
        }
         */
        System.out.println("Out of 'if'");
    }
}

