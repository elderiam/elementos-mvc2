package org.unitec.elementosmvc2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class ElementosMvc2Application implements CommandLineRunner {

	@Autowired RepositorioMensaje repoMensaje;
	public static void main(String[] args) {
		SpringApplication.run(ElementosMvc2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		LocalDate fecha=LocalDate.now();
		repoMensaje.save(new Mensaje("Mi primer MENSAJE",fecha));
	}
}
