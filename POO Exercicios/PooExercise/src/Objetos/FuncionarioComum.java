package Objetos;

public class FuncionarioComum extends Funcionario{
    double salarioMensal;

    public FuncionarioComum(String nome, String cpf, double salarioMensal) {
        super(nome, cpf);
        this.salarioMensal = salarioMensal;
    }

    public double calcularSalario() {
        return salarioMensal;
    }
}


