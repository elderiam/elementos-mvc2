package org.unitec.elementosmvc2.Tarjetas;

public class Credito implements  Tarjeta{
    @Override
    public void obtenerSaldo() {
        System.out.println("Tu saldo es de 40,000");
    }
}
