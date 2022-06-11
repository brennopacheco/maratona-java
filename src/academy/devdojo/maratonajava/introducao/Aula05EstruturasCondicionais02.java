package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        // age < 15 children's category
        // age >= 15 && age < 18 juvenile category
        // age >= 18 && age < adult category

        int age = 12;
        String categoria;

        if (age < 15) {
            categoria = "Children's Category";
        } else if (age >= 15 && age <18) {
            categoria = "Juvenil Category";
        } else {
            categoria = "Adult Category";
        }

        System.out.println(categoria);
    }
}
