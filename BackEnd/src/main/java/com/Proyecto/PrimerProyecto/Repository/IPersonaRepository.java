
package com.Proyecto.PrimerProyecto.Repository;

import com.Proyecto.PrimerProyecto.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Long> {
    
}
