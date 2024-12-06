package ifma.lista04;

public class Test {

    public static void main(String[] args) {
        DequeList lista = new DequeList();

        Aluno a1 = new Aluno("Amanda", 9, 6);
        Aluno a2 = new Aluno("Igor", 8, 6.5);

        lista.addFirst(a1);
        lista.addFirst(a2);

        System.out.println(lista);

        System.out.println("Resultado da Busca: " + lista.search("Igor").aluno.toString());
        System.out.println();

        System.out.println("Primeiro: " + lista.getFirst().aluno.toString());
        System.out.println("Ultimo: " + lista.getLast().aluno.toString());

        //System.out.println("Aluno " + lista.removeFirst() + " removido do inicio");
        //System.out.println(lista);

        System.out.println("Aluno " + lista.removeLast() + " removido do final");
        System.out.println(lista);

        // problema no remover arrumar depois
    }
}
