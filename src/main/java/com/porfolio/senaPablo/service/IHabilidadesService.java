
package com.porfolio.senaPablo.service;

import com.porfolio.senaPablo.model.Habilidades;
import java.util.List;

/**
 *
 * @author pablo
 */
public interface IHabilidadesService {
     public List<Habilidades> verHabilidades();
    public void crearHabilidad (Habilidades hab);
    public void borrarHabilidad (Long id);
    public Habilidades buscarHabilidad (Long id);
    public void cambiarHabilidad(Habilidades hab);
}
