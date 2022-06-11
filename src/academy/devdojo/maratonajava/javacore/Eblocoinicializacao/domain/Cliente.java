package academy.devdojo.maratonajava.javacore.Eblocoinicializacao.domain;

public class Cliente {
    // private int[] parcelas = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};  imagine que agora queremos ter 80 parcelas
    private int[] parcelas;

    {
        parcelas = new int[80];
        System.out.println("Dentro do bloco de inicializção");
        for (int i = 1; i <= 80; i++) {
            parcelas[i - 1] = i;
        }
    }

    public Cliente() {
    }

    public int[] getParcelas() {
        return parcelas;
    }

    public void setParcelas(int[] parcelas) {
        this.parcelas = parcelas;
    }
}
