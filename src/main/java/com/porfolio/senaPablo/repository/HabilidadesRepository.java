
package com.porfolio.senaPablo.repository;

import com.porfolio.senaPablo.model.Habilidades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author pablo
 */
@Repository
public interface HabilidadesRepository extends JpaRepository<Habilidades, Long> {
    
}
