package Objetos;

import java.util.ArrayList;

public class TesteFuncionario{

    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

        funcionarios.add(new FuncionarioComum("Igor Ryan", " 898.987.999.87", 17000));
        funcionarios.add(new FuncionarioComissado("Alves Dias", " 232.2323.45.44",1530, 150));
        funcionarios.add(new FuncionarioHorista("José Bruno", " 123.345.567-87", 8, 45));
        funcionarios.add(new FuncionarioHorista("Bruno Alves", " 123.345.567-87", 8, 45));


        int i = 0;
        while (i < funcionarios.size()){
            Funcionario funcionario = funcionarios.get(i);
            System.out.println(funcionario.toString() + " Sálario:" + funcionario.calcularSalario());
            i++;
        }

    }
}

