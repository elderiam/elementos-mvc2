package org.unitec.elementosmvc2.Tarjetas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
    public class InterfazUsuario implements CommandLineRunner {

        @Autowired ServicioTarjeta servicio;
         public static void main(String[] args) {
            SpringApplication.run(org.unitec.elementosmvc2.Tarjetas.InterfazUsuario.class, args);

        }

    @Override
    public void run(String... args) throws Exception {
        servicio.obtenerSaldo().obtenerSaldo();
    }
}

