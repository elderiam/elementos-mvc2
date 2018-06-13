package org.unitec.elementosmvc2;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")//Application Progaming Interface
@CrossOrigin //Origenes cruzados a servidores que no esten en el mismo lugar
public class ControladorMensaje {

    @GetMapping("/hola")
    public String algo(){
        return "Hola mundo desde un controlador";
    }
}
