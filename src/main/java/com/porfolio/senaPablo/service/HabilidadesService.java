
package com.porfolio.senaPablo.service;

import com.porfolio.senaPablo.model.Habilidades;
import com.porfolio.senaPablo.repository.HabilidadesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author pablo
 */
@Service
public class HabilidadesService  implements IHabilidadesService{
    
    @Autowired
   public HabilidadesRepository habRep; 

    @Override
    public List<Habilidades> verHabilidades() {
        return habRep.findAll();
    }

    @Override
    public void crearHabilidad(Habilidades hab) {
            habRep.save(hab);
        }

    @Override
    public void borrarHabilidad(Long id) {
        habRep.deleteById(id);
    }

    @Override
    public Habilidades buscarHabilidad(Long id) {
        return habRep.findById(id).orElse(null);
    }

    @Override
    public void cambiarHabilidad(Habilidades hab) {
        habRep.save(hab);
    }
}
