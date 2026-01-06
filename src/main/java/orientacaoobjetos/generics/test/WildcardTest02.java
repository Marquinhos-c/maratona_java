package orientacaoobjetos.generics.test;


import java.util.ArrayList;
import java.util.List;

public class WildcardTest02 {
    public static void main(String[] args) {
        // List.of cria listas imutáveis (não podem ser alteradas), mas servem para leitura
        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());
        printConsulta(cachorros); // Agora printConsulta funcionando
        printConsulta(gatos);    // após definir para funcionar para as classes filha

        List<Animal> animaisMutaveis = new ArrayList<>();
        printConsultaAnimal(animaisMutaveis);


    }
    /*
    O Curinga ? extends (Covariância)
    Na assinatura: List<? extends Animal>
    O que significa: "Aceito qualquer Lista que seja de Animal ou de qualquer filho de Animal
     (ex: List<Cachorro>, List<Gato>)".
     */
    /*
    A restrição: Você NÃO PODE ADICIONAR nada na lista (exceto null).
    Por que? Porque o Java não sabe se a lista que você passou é de Cachorro ou de Gato.
    Se ele deixasse você adicionar, você poderia tentar colocar um Gato numa lista que,
     na memória, é de Cachorro.
     */
    private static void printConsulta(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.consultar();
        }
    }
    /*
    . O Curinga ? super (Contravariância)
        Na assinatura: List<? super Animal>

       O que significa: "Aceito qualquer Lista que seja de Animal
        ou de qualquer pai de Animal (ex: List<Object>)".
       O superpoder: Permite ADICIONAR dados. Como a lista aceita Animal
        (ou algo mais genérico como Object), é seguro adicionar um Cachorro ou Gato, pois ambos são Animais.

       A restrição: Você não consegue LER de forma específica.
        Por que? Se você tentar ler, o Java só garante que virá um Object.
        Ele não pode garantir que virá um Animal, pois a lista original
        poderia ser List<Object> contendo Strings ou números misturados.
     */
    private static void printConsultaAnimal(List<? super Animal> animals) {
        animals.add(new Cachorro());
        animals.add(new Gato());
    }
    /*
    A Regra de Ouro: PECS
    Para nunca mais esquecer quando usar qual, lembre-se da sigla PECS:
    Producer Extends, Consumer Super
    Se a lista vai Produzir dados para você ler (Get/Iterar) $\rightarrow$ Use ? extends.
    Se a lista vai Consumir dados que você vai inserir (Add) $\rightarrow$ Use ? super.
     */
}
