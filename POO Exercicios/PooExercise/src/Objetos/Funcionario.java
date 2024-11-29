package Objetos;

// classe abstrata
public abstract class Funcionario {
    String nome;
    String cpf;

    public Funcionario(String nome, String cpf){
        this.cpf = cpf;
        this.nome = nome;
    }

    public abstract double calcularSalario();

    public String toString() {
        return nome + cpf;
    }

}
