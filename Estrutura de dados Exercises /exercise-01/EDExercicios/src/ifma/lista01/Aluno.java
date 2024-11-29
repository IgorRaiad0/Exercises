package ifma.lista01;

public class Aluno {
    private int codigo;
    private String nome;
    private String matricula;

    // Construtor
    public Aluno(int codigo, String nome, String matricula) {
        this.codigo = codigo;
        this.nome = nome;
        this.matricula = matricula;
    }

    // encapsulando
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String toString() {
        return "Aluno{" + "codigo=" + codigo + ", nome='" + nome + '\'' + ", matricula='" + matricula + '\'' + '}';
    }


}

