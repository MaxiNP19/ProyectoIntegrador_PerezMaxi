/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.mnp.controller;

import com.portfolio.mnp.Entity.Persona;
import com.portfolio.mnp.Interface.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Máximo
 */
@RestController
public class PersonaController {
    @Autowired IPersonaService ipersonaService;/*creo la avriable persona*/
    
    @GetMapping("personas/traer")/*con este metodo traigo el dato desde la base de datos al frontend*/
    
    public List<Persona> getPersona(){
        
        return ipersonaService.getPersona();
    }
    
    @PostMapping("personas/crear")/*inversamente al getMapping, desdee el frontend pido guardar el dato en la base de datos*/
    public String createPersona(@RequestBody Persona persona){
    ipersonaService.savePersona(persona);
    return "Persona creada correctamente.";
    }
   
    @DeleteMapping("/personas/borrar{id}")
    public String deletePersona(@PathVariable Long id){
        ipersonaService.deletepersona(id);
        return "Persona borrada correctamente.";
    }
    
    @PutMapping("/personas/editar{id}")
    public Persona editPersona(@PathVariable Long id,
    @RequestParam("nombre") String nuevoNombre, 
    @RequestParam("apellido") String nuevoApellido,
    @RequestParam("img") String nuevoImagen)
    {
        /*creo una variable y le guardo el metodo de buscar una persona*/
        Persona persona = ipersonaService.findPersona(id);
        /*cambio sus atributos*/
        persona.setNombre(nuevoNombre);
        persona.setApellido(nuevoApellido);
        persona.setImg(nuevoImagen);
       /*guardo los cambios*/
        ipersonaService.savePersona(persona);
        return persona;
        
    
}
}
