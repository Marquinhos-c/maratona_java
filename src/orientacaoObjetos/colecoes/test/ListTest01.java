package orientacaoobjetos.colecoes.test;

import java.util.ArrayList;
import java.util.List;
/*
Estrutura, Aceita Duplicatas?,           Tem Ordem?,                   Quando usar?

ArrayList,    Sim,                       Sim (Índice),                "Listas gerais, acesso rápido."
LinkedList,   Sim,                       Sim (Índice),                 Muita inserção/remoção de dados.
HashSet,      Não,                       Não,                          "Garantir itens únicos, performance alta."
HashMap,     "Chaves não, Valores sim",  Não,                           Buscar valores por uma chave (ID).
*/
public class ListTest01 {
    public static void main(String[] args) {
        // Criando duas Listas de String.
        // É uma boa prática declarar a variável como List (a interface)
        // e instanciar como ArrayList (a implementação).
        List <String> nomes = new ArrayList<>();
        List <String> nomes2 = new ArrayList<>();

        // Adicionando elementos à primeira lista (nomes)
        nomes.add("Marcos");
        nomes.add("Luffy");
        // Adicionando elementos à segunda lista (nomes2)
        nomes2.add("Micael");
        nomes2.add("João");

        // Removendo o elemento no índice 1 da lista 'nomes' ("Luffy")
        nomes.remove(1);
        // Adicionando todos os elementos da 'nomes2' ao final da 'nomes'
        nomes.addAll(nomes2);

        for (String nome : nomes) {
            System.out.println(nome);
        }
        nomes.add("Evenllyn");
        System.out.println("--------------");

        // Loop "For" clássico: usado quando você precisa do controle do índice (i).
        // nomes.size() agora retorna 4.
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }
    }
}
