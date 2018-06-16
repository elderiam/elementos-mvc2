package org.unitec.elementosmvc2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")//Application Progaming Interface
@CrossOrigin //Origenes cruzados a servidores que no esten en el mismo lugar
public class ControladorMensaje {

    @Autowired RepositorioMensaje repomensa;
    //Caso a) Buscar todos

    @GetMapping("/mensaje")
    public List<Mensaje> buscarTodos(){

      return repomensa.findAll();
    }

    //CASO b) Buscar por id

    @GetMapping("/mensaje/{id}")
    public Mensaje buscarPorId(@PathVariable String id){

       return repomensa.findById(id).get();

    }
}
