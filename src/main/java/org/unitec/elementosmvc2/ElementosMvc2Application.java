package org.unitec.elementosmvc2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class ElementosMvc2Application implements CommandLineRunner {

	@Autowired RepositorioMensaje repoMensaje; //inyeccion de dependencias
	public static void main(String[] args) {
		SpringApplication.run(ElementosMvc2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*

		LocalDate fecha=LocalDate.now();

		//repoMensaje.save(new Mensaje("Hola","cerdito",fecha));

		//Buscar todos los mensajes
		for(Mensaje mensa:  repoMensaje.findAll()){
			System.out.println(mensa);
		}


		//Buscar por ID

		//System.out.println(repoMensaje.findById("5b0dfe066b029d127809cc2c").get());

		//Buscar por el cuerpo del mensaje

		//System.out.println(repoMensaje.findByCuerpo("cerdito"));

		//Eliminar un mensaje
		Mensaje mens=new Mensaje();
		mens.setId("Hola");
		repoMensaje.delete(mens);

*/
	}
}
