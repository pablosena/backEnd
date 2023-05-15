package com.porfolio.senaPablo.controller;

import com.porfolio.senaPablo.model.Habilidades;
import com.porfolio.senaPablo.service.IHabilidadesService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author pablo ivan Sena
 */


@RestController
@CrossOrigin("http://localhost:4200/inicio")
public class Controller {
     @Autowired
    private IHabilidadesService habSer;
    
    @GetMapping("/hola")
    public String hola(){
        return "hola";
    }
    
    @PostMapping("/nueva/habilidad")
    public void agregarHabilidad (@RequestBody Habilidades hab){
        //listaPersona.add(pers);
        habSer.crearHabilidad(hab);
    }
    @GetMapping("/ver/habilidades")
    @ResponseBody
    public List<Habilidades> verHabilidades(){
     //   return listaPersona;
     return habSer.verHabilidades();
    }
    @DeleteMapping("/borrar/{id}")
    public void borrarPersona(@PathVariable Long id){
        habSer.borrarHabilidad(id);
    }
    @PutMapping("/modificar/persona")
    public void cambiarDatos(@RequestBody Habilidades hab){
        habSer.cambiarHabilidad(hab);
    }
}
