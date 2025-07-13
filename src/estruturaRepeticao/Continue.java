package estruturaRepeticao;
// Dado o valor do carro, descubra em quantas ele pode ser parcelado sem juros.
// Sendo que valor da parcela tem que ser maior ou igual  1000
public class Continue {
    public static void main(String[] args) {
        double valorCarro = 30000;
        // casting: passando um valor double para int
        for (int parcela = (int)valorCarro; parcela >= 1; parcela--){
            double valorParcela = valorCarro / parcela;
            if (valorParcela < 1000) {
                continue;
            }
            System.out.println("parcela " + parcela + " R$" + valorParcela);
        }
    }
}
