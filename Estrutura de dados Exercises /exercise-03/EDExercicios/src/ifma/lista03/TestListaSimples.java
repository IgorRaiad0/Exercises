package ifma.lista03;

public class TestListaSimples {
    public static void main(String[] args) {
        SimpleList lista = new SimpleList();
        lista.adicionarInicio(4);
        lista.adicionarInicio(6);
        lista.adicionarInicio(8);
        lista.adicionarInicio(15);
        lista.adicionarFim(8);
        lista.adicionarFim(5);
        lista.adicionarFim(45);

        // Chamando os métodos

        System.out.println("lista inicial: " + lista);
        System.out.println("Maior valor: "+lista.MaiorValor());
        System.out.println("Menor valor: "+lista.MenorValor());
        System.out.println("Media: "+lista.Media());
        System.out.println(lista.removerComeco() + " removido do começo");
        //System.out.println(lista.removerFinal() + " removido do final");

        System.out.println("lista final: " + lista);

    }


}