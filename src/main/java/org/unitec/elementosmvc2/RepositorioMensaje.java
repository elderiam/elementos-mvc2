package org.unitec.elementosmvc2;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositorioMensaje extends MongoRepository<Mensaje, String> {
    public  Mensaje findByCuerpo(String cuerpo); //Crear metodo para buscar el cuerpo del mensjae
}
