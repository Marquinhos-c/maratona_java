package orientacaoobjetos.classes.test;

import orientacaoobjetos.classes.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro(); // objeto para carro 1
        Carro carro2 = new Carro(); // objeto para carro 2
        // dados do carro 1
        carro1.nome = "Astra";
        carro1.modelo = "Sedan";
        carro1.ano = 2011;
        // dados do carro 2
        carro2.nome = "S10";
        carro2.modelo = "Camionete";
        carro2.ano = 2023;
        // isso faz com que carro 1 receba os mesmo dados de carro 2
        carro1 = carro2;

        System.out.println("Carro 1: ");
        System.out.println("nome: " + carro1.nome + " | modelo: " + carro1.modelo + " | ano: " + carro1.ano);
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Carro 2: ");
        System.out.println("nome: " + carro2.nome + " | modelo: " + carro2.modelo + " | ano: " + carro2.ano);
    }
}
