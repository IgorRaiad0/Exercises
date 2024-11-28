package Objetos;

// classe abstrata
public class Funcionario {
    String nome;
    String cpf;

    public Funcionario(String nome, String cpf){
        this.cpf = cpf;
        this.nome = nome;
    }

    public double calcularSalario(){
        return ' ';
    }

    public String toString() {
        return nome + cpf;
    }


}
