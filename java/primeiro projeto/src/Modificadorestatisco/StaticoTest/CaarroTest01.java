package Modificadorestatisco.StaticoTest;

import Modificadorestatisco.Dominio.Carro;

public class CaarroTest01 {
        public static void main(String[] args) {
        Carro carro1 = new Carro("BMW",280);
        Carro carro2 = new Carro("Mercedes",275);
        Carro carro3 = new Carro("audi",290);
            Carro.velocidadeLimine=180;
        carro1.imprime();
        carro2.imprime();
        carro3.imprime();

    }
}
