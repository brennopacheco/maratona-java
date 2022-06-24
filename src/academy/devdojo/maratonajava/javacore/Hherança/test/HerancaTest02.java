package academy.devdojo.maratonajava.javacore.Hherança.test;

import academy.devdojo.maratonajava.javacore.Hherança.dominio.Funcionario;

public class HerancaTest02 {
    // 0 - Bloco de inicialização estático da superclasse é executado quando a JVM carregar a classe (Mãe)
    // 1 - Bloco de inicialização estático da subclasse é executado quando a JVM carregar a classe (filha)
    // 2 - Alocado espaço em memória pro objeto da classe mãe
    // 3 - Cada atributo de classe pai é criado e inicializado com valores default ou o que for passada
    // 4 - Bloco de inicialização da superclasse é executado na ordem que aparece
    // 5 - Construtor é executado da superclasse
    // -----------------------------------------------------------------------------------------------------------------
    // 6 - Alocado espaço em memória pro objeto da classe filha
    // 7 - Cada atributo de classe filha é criado e inicializado com valores default ou o que for passada
    // 8 - Bloco de inicialização da subclasse é executado na ordem que aparece
    // 9 - Construtor é executado da subclasse
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Jiraya");
    }
}
