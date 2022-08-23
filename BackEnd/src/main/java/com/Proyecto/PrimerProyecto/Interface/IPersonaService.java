package com.Proyecto.PrimerProyecto.Interface;

import com.Proyecto.PrimerProyecto.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    //traer una persona
    public List<Persona> getPersona();
    
    //guardar un objeto de tipo persona
    public void savePersona(Persona persona);
    
    //eliminar una persona
    public void deletePersona(Long id);
    
    //buscar una persona por ID
    public Persona findPersona(Long id);
    
}
