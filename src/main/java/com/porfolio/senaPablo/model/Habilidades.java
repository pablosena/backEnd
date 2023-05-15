
package com.porfolio.senaPablo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import static jakarta.persistence.GenerationType.AUTO;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author pablo ivan sena
 */
@Getter @Setter
@Entity
public class Habilidades {
    
    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;
    
    private String campo;
    private String nivel;
    private int exp;
    private String descr;
    
    public Habilidades(){
        
    }

    public Habilidades(Long id, String campo, String nivel, int exp, String descr) {
        this.id = id;
        this.campo = campo;
        this.nivel = nivel;
        this.exp = exp;
        this.descr = descr;
    }
    
}
