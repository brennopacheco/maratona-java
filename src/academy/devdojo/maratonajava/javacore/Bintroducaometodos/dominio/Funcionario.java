package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprimeDados() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        /* Esse metodo nao é escalavel, caso tivessemos mais um salario, teriamos que voltar no código
        System.out.println("R$" + this.salario[0]);
        System.out.println("R$" + this.salario[1]);
        System.out.println("R$" + this.salario[2]);
         */
        if (salarios == null)
            return;
        for (double salario : salarios) {
            System.out.print("R$" + salario + " ");
        }
    }

    public void mediaSalarios() {
        double media = 0;
        if (salarios == null) {
            return;
        }
        for (double salario : salarios) {
            media += salario;
        }
        media /= salarios.length;

        System.out.println("\nMédia salario: R$" + media);
    }

    public void imprime() {
        imprimeDados();
        mediaSalarios();
    }
}
