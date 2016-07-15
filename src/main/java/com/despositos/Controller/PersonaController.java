package com.despositos.Controller;

import com.despositos.model.Persona;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sebastian.suarez on 15/07/2016.
 */
@Controller
@RestController
public class PersonaController {
    @RequestMapping("/persona")
    public Persona modelo() {
        Persona persona = new Persona();
        persona.setNombre("Mary");
        persona.setApellido("Porreca");
        return persona;
    }
}
