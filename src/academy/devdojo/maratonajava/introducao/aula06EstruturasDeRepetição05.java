package academy.devdojo.maratonajava.introducao;

public class aula06EstruturasDeRepetição05 {
    public static void main(String[] args) {
        // Given the value of a car, find out how many times it can be paid in installments
        // Condition installmentsValue >= 1000

        double valorTotal = 30000;


        for (int parcela = (int)valorTotal; parcela >= 1; parcela--) {
            double valorParcela = valorTotal / parcela;
            if(valorParcela < 1000){
                continue;
            }
            System.out.println("Parcela " + parcela + " de R$" + valorParcela);
        }


    }
}
