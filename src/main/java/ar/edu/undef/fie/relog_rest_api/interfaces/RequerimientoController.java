package ar.edu.undef.fie.relog_rest_api.interfaces;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequerimientoController {
    @GetMapping("/requerimientos")
    public String index(){
        return  "Hola soy requerimeinto";
    }

}
