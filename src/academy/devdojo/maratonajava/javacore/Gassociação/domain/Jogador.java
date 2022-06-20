package academy.devdojo.maratonajava.javacore.Gassociação.domain;

public class Jogador { // Associação Bidirecional
    private String nome;
    private Time time; // jogador tem time

    public Jogador(String nome) {
        this.nome = nome;
    }

    public void imprime() {
        System.out.println(this.nome);
        if(time != null){
            System.out.println(time.getNome()); // indo dentro do obj Time pegar o 'nome'
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}
