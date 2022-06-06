
package cl.java.spring.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SitioControlador {
    
    @GetMapping("/")
    public String inicio(){
        return "/inicio";
    }
    
    @GetMapping("/nosotros")
    public String nosotros(){
        return "sitio/nosotros";
    }
    
    @GetMapping("/contacto")
    public String contacto(){
        return "sitio/contacto";
    }
    
}
