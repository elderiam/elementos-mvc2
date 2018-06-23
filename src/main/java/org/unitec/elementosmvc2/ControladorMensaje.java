package org.unitec.elementosmvc2;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")//Application Progaming Interface
@CrossOrigin //Origenes cruzados a servidores que no esten en el mismo lugar
public class ControladorMensaje {

    @Autowired RepositorioMensaje repomensa;
    //CASO a) ---> Buscar todos

    @GetMapping("/mensaje")
    public List<Mensaje> buscarTodos(){

      return repomensa.findAll();
    }

    //Caso b) ---> Buscar por id

    @GetMapping("/mensaje/{id}")
    public Mensaje buscarPorId(@PathVariable String id){

       return repomensa.findById(id).get();

    }

    //Caso c) ---> Guardar

    @PostMapping("/mensaje")
    public Estatus guardar(@RequestBody String json) throws Exception {

        //Primero convertimos este string json a un objeto java
        ObjectMapper mapper = new ObjectMapper(); //Clase para convertir el objeto java y solo esta en Spring
       Mensaje mensa = mapper.readValue(json, Mensaje.class);
       repomensa.save(mensa); //este es el que guarda
        System.out.println("Este objeto se convirtio: "+mensa);
        Estatus estatus = new Estatus();
        estatus.setSucess(true);
        estatus.setMensaje("Mensaje guardado con exito!!!");
        return estatus;
    }

    //Caso d) ---> Actualizar

    @PutMapping("/mensaje")
    public Estatus actualizar (@RequestBody String json) throws Exception {

        //Primero convertimos este string json a un objeto java
        ObjectMapper mapper = new ObjectMapper(); //Clase para convertir el objeto java y solo esta en Spring
        Mensaje mensa = mapper.readValue(json, Mensaje.class);
        repomensa.save(mensa); //este es el que guarda
        System.out.println("Este objeto se convirtio: "+mensa);
        Estatus estatus = new Estatus();
        estatus.setSucess(true);
        estatus.setMensaje("Mensaje guardado con exito!!!");
        return estatus;
    }


    //Caso e) Borrar
    @DeleteMapping("/mensaje/{id}")
    public Estatus boorrarPorId(@PathVariable String id){
        Mensaje mensa = new Mensaje();

        repomensa.deleteById(id);
        Estatus e=new Estatus();
        e.setSucess(true);
        e.setMensaje("Mensaje borrado con exito!!");
        return  e;
    }




}
