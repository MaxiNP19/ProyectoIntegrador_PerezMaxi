/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.mnp.Service;

import com.portfolio.mnp.Entity.Persona;
import com.portfolio.mnp.Interface.IPersonaService;
import com.portfolio.mnp.Repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Máximo
 */
@Service
public class ImplePersonaService implements IPersonaService{
    @Autowired IPersonaRepository IpersonaRepository;
    
    
    @Override
    public List<Persona> getPersona() {
        
        List<Persona> persona = IpersonaRepository.findAll();
        return persona;
    }

    @Override
    public void savePersona(Persona persona) {
      IpersonaRepository.save(persona);
    }

    @Override
    public void deletepersona(Long id) {
       IpersonaRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona persona = IpersonaRepository.findById(id).orElse(null);
        return persona;
        
    }
    
}
