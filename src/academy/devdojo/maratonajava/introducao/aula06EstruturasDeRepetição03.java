package academy.devdojo.maratonajava.introducao;

public class aula06EstruturasDeRepetição03 {
    public static void main(String[] args) {
        // Given a number from 0 to 50 print the fist 25

        int valueMax = 50;
        for (int i = 0; i < valueMax; i++) {
            if(i > 25){
                break;
            }
            System.out.println(i);
        }
    }
}
