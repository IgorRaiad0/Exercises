package Objetos;

public class FuncionarioHorista extends Funcionario {
    int horasTrabalhadas;
    double valorHora;

    public FuncionarioHorista(String nome, String cpf, int horasTrabalhadas, double valorHora){
        super(cpf, nome);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSalario() {
        return horasTrabalhadas * valorHora;
    }
}
