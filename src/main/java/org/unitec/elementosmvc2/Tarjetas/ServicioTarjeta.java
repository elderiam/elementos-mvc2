package org.unitec.elementosmvc2.Tarjetas;


import org.springframework.context.annotation.Configuration;

@Configuration
public class ServicioTarjeta {
        Tarjeta obtenerSaldo(){
            return  new Debito();
    }
}
