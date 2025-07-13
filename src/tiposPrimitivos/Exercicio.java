package tiposPrimitivos;
/*
Prática
Crie variáveis para os campos descritos abaixo entre <> imprima a seguinte mensagem

eu <nome>, morando no <endereço>,
confirmo que recebi o salário de <salario>, na data <data>
 */
public class Exercicio {
    public static void main(String[] args) {
        String nome = "Marcos";
        String endereco = "Rua Marechal rondon";
        double salario = 3300.5;
        String dataRecebimento = "24.06.2025";
        String relatorio = "eu " + nome + ", morando no endereço, " + endereco +
                ", confirmo que recebi o salário de " + salario + ", na data " + dataRecebimento;

        System.out.println(relatorio);
    }
}
