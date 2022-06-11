package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04Exercicio {
    public static void main(String[] args) {
        // I want to know how much I have to pay in the Netherlands 2020 based on my annual salary

        double annualSalary = 45000;
        double taxes = annualSalary;

        if (annualSalary < 34712) {
            taxes *=  0.097;
        } else if (annualSalary >= 34713 && annualSalary < 68507) {
            taxes *= 0.3735;
        } else {
            taxes *= 0.495;
        }

        System.out.println("You will pay in taxes €" + taxes);
    }
}
