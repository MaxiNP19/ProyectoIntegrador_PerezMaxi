/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.mnp.Interface;

import com.portfolio.mnp.Entity.Persona;
import java.util.List;


/**
 *
 * @author Máximo
 */
public interface IPersonaService {
    /*pedir a personas*/
    public List<Persona> getPersona();
    /* guardar un objeto de la clase Persona*/
    public void savePersona(Persona persona);
    
    /*borrar un objeto Persona por id*/
    public void deletepersona(Long id);
    
    /*Buscar un objeto Persona por id*/
    public Persona findPersona(Long id);
    
    
    
}
