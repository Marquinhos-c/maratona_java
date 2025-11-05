package orientacaoobjetos.colecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List <String> nomes = new ArrayList();
        List <String> nomes2 = new ArrayList();
        nomes.add("Marcos");
        nomes.add("Luffy");
        nomes2.add("Micael");
        nomes2.add("João");

        nomes.remove(1);
        nomes.addAll(nomes2);

        for (String nome : nomes) {
            System.out.println(nome);
        }
        nomes.add("Evenllyn");
        System.out.println("--------------");

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }
    }
}
