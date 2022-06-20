package academy.devdojo.maratonajava.javacore.Gassociação.Exercicio.dominio;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this(nome, especialidade);
        this.seminarios = seminarios;
    }

    public void imprime() {
        System.out.println("------");
        System.out.println("Professor: " + this.nome);
        if (seminarios == null) return;
        System.out.println("Seminários cadastrados: ");
        for (Seminario seminario : this.seminarios) {
            System.out.println(seminario.getTitulo());
            System.out.println(seminario.getLocal().getEndereço());
            if (seminario.getEstudantes() == null || seminario.getEstudantes().length == 0) continue;
            System.out.println("** Alunos **");
            for (Estudante estudante : seminario.getEstudantes()) {
                System.out.println("Aluno: " + estudante.getNome() + " Idade: " + estudante.getIdade());
            }

        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
