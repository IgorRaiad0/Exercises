package ifma.lista01;

public class TestarAluno {
    public static void main(String[] args) {

        CadastrarAluno cadastro = new CadastrarAluno(5);

        Aluno aluno1 = new Aluno(1, "Igor Ryan", "qwe123");
        Aluno aluno2 = new Aluno(2, "Italo", "123erf");
        Aluno aluno3 = new Aluno(3, "Iago", "123erf");
        Aluno aluno4 = new Aluno(4, "Iury", "123erf");
        Aluno aluno5 = new Aluno(5, "Iot", "123erf");
        Aluno aluno6 = new Aluno(6, "fgfg", "123erf");

        cadastro.adicionarNoFinal(aluno1);
        cadastro.adicionarNoFinal(aluno2);
        cadastro.adicionarNoFinal(aluno3);
        cadastro.adicionarNoFinal(aluno4);
        cadastro.adicionarNoFinal(aluno5);
        cadastro.adicionarNoFinal(aluno6);


        cadastro.listarAlunos();
    }
}
