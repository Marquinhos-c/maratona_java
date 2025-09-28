package estruturascondicionais;

public class Introducao {
    public static void main(String[] args) {
        int idade = 19;
        boolean isAutorizadoComprarBedidaAlcolica = idade >= 18; // usando tipo boolean para verificar idade
        if (isAutorizadoComprarBedidaAlcolica) {
            System.out.println("Autorizado comprar bebida alcólica! ");
        }
        // usando operador lógico " ! ", se a idade for menor será executado
        if (!isAutorizadoComprarBedidaAlcolica) {
            System.out.println(" Não autorizado comprar bebida alcólica! ");
        }
    }
}
