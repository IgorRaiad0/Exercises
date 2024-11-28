package Objetos;

public class FuncionarioComissado extends Funcionario {
    double salarioBase;
    double comissao;

    public FuncionarioComissado(String nome, String cpf, double salarioBase, double comissao) {
        super(nome, cpf);
        this.salarioBase = salarioBase;
        this.comissao = comissao;
    }

    public double calcularSalario() {
        return salarioBase + comissao;
    }
}

