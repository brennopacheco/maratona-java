package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // Operadores térnarios -> (condition) ? true : false;

        // Donate if salary > 5000
        double salary = 6000;
        String messageDonate = "I will donate 500 to DevDojo.";
        String messageNotDonate = "I do not have conditions, but I will have!";

        String result = (salary > 5000) ? messageDonate : messageNotDonate;
        //other way to do the same thing
        // System.out.println(salary > 5000 ? messageDonate : messageNotDonate);
        // System.out.println(salary > 5000 ? "I will donate 500 to DevDojo." : "I do not have conditions, but I will have!");

        System.out.println(result);

        /*
        String result;
        if (salary > 5000) {
            result = messageDonate;
        } else {
            result = messageNotDonate;
        }
        System.out.println(result);
         */


    }
}
