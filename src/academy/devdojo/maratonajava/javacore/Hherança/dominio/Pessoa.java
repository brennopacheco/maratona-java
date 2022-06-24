package academy.devdojo.maratonajava.javacore.Hherança.dominio;

public class Pessoa {
    protected String nome;
    protected String CPF;
    protected Endereco endereço;

    static {
        System.out.println("Dentro do bloco de inicialização estático de Pessoa");
    }

    {
        System.out.println("Dentro do bloco de inicialização de Pessoa - 1");
    }

    {
        System.out.println("Dentro do bloco de inicialização de Pessoa - 2");
    }

    public Pessoa(String nome) {
        System.out.println("Dentro do construtor Pessoa");
        this.nome = nome;
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.CPF);
        System.out.println(this.endereço.getRua() + " " + this.endereço.getCEP());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public Endereco getEndereço() {
        return endereço;
    }

    public void setEndereço(Endereco endereço) {
        this.endereço = endereço;
    }
}
