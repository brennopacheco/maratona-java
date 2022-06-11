package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private String estudio; // "Foi pedido, depois do código pronto, para adicionar o estudio. (se fosse adicionado no nosso primeiro construtor, iria corromper nossos outros códigos)

    public Anime(String nome, String tipo, int episodios, String genero) { // método construtor
        this(); // chama o construtor sem argumentos da linha 23
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }

    public Anime(String nome, String tipo, int episodios, String genero, String estudio) { // Sobrecarga de metodo construtor
        this(nome, tipo, episodios, genero); // o this tem que ser OBRIGATORIAMENTE a primeira linha. Delega a responsabilidade p/ o construtor da linha 10.
        this.estudio = estudio;
    }

    public Anime() { //possibilita passar um método construtor sem atributos
        System.out.println("Dentro do construtor sem argumentos");
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
        System.out.println(this.estudio);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public int getEpisodios() {
        return episodios;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
