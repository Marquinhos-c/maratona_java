package estruturaRepeticao;
// Dado o valor do carro, descubra em quantas ele pode ser parcelado sem juros.
// Sendo que valor da parcela tem que ser maior ou igual  1000
public class ParcelaDoCarro {
    public static void main(String[] args) {
        double valorCarro = 30000;
        for (int pacela = 1; pacela <= valorCarro ; pacela++) {
            double valorParcela = valorCarro / pacela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela " + pacela + " R$" + valorParcela);
        }
    }
}
