package academy.devdojo.maratonajava.javacore.GAssociação.Exercicio.dominio;

public class Seminario {
    private String titulo;
    private Estudante[] estudantes;
    private Local local;

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Seminario(String titulo, Estudante[] estudantes) {
        this(titulo);
        this.estudantes = estudantes;
    }

    public Seminario(String titulo, Estudante[] estudantes, Local local) {
        this(titulo, estudantes);
        this.local = local;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Estudante[] getEstudantes() {
        return estudantes;
    }

    public void setEstudantes(Estudante[] estudantes) {
        this.estudantes = estudantes;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
