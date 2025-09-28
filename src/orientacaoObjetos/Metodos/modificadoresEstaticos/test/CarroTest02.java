package orientacaoobjetos.metodos.modificadoresEstaticos.test;

import orientacaoobjetos.metodos.modificadoresEstaticos.domain.Carro02;

public class CarroTest02 {
    public static void main(String[] args) {
        Carro02.setVelocidadeLimite(180);
        
        Carro02 c1 = new Carro02("BMW", 280);
        Carro02 c2 = new Carro02("Mercedes", 275);
        Carro02 c3 = new Carro02("Audi", 290);


        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
