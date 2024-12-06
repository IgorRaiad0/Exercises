
package ifma.lista01;

public class CadastrarAluno {
    private int contador = 0;
    private Aluno[] listaAlunos;
    private int tamanho;

    public CadastrarAluno(int tamanho) {
        this.contador = 0;
        this.tamanho = tamanho;
        this.listaAlunos = new Aluno[tamanho];
    }

    // Adicionar no final
    public void adicionarNoFinal(Aluno aluno) {
        if (contador < listaAlunos.length) {
            listaAlunos[contador] = aluno;
            contador++;
        } else {
            System.out.println("Vetor cheio!");
        }
    }

    // Adicionar no início
    public void adicionarNoinicio(Aluno aluno) {
        if (contador < listaAlunos.length) {
            // Desloca os alunos para a direita
            for (int i = contador; i > 0; i--) {
                listaAlunos[i] = listaAlunos[i - 1];
            }
            listaAlunos[0] = aluno;  // Adiciona o aluno na posição 0
            contador++;
        } else {
            System.out.println("Vetor cheio!");
        }
    }

    // Remover no final
    public void removerNoFinal() {
        if (contador > 0) {
            listaAlunos[contador - 1] = null;
            contador--;
        } else {
            System.out.println("Não há alunos para remover.");
        }
    }

    // Remover no início
    public void removerNoInicio() {
        if (contador > 0) {
            // Desloca todos os alunos para a esquerda
            for (int i = 0; i < contador - 1; i++) {
                listaAlunos[i] = listaAlunos[i + 1];
            }
            listaAlunos[contador - 1] = null; // A última posição fica nula
            contador--;
        } else {
            System.out.println("Não há alunos para remover.");
        }
    }

    // Verificar se o índice é válido e contém um aluno
    public boolean verificarIndice(int indice) {
        return indice >= 0 && indice < contador && listaAlunos[indice] != null;
    }

    // Remover aluno por índice
    public String removerComIndice(int indice) {
        if (!verificarIndice(indice)) {
            System.out.println("Erro: Índice inválido ou não ocupado por um aluno.");
            return null;
        }

        // Guarda o nome do aluno para retornar
        String nomeRemovido = listaAlunos[indice].getNome();
        if (indice == 0) {
            removerNoInicio();
        }
        else if (indice == contador - 1) {
            removerNoFinal();
        }
        else {
            for (int i = indice; i < contador - 1; i++) {
                listaAlunos[i] = listaAlunos[i + 1];
            }
            listaAlunos[contador - 1] = null; // A última posição fica nula
            contador--;
        }
        return nomeRemovido;
    }

    // Listar todos os alunos
    public void listarAlunos() {
        if (contador == 0) {
            System.out.println("Nenhum aluno cadastrado.");
        } else {
            for (int i = 0; i < contador; i++) {
                System.out.println(listaAlunos[i]);
            }
        }
    }

}


