/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutoria.domingo.repositorio;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import tutoria.domingo.modelo.Reservaciones;
import tutoria.domingo.interfaces.InterfaceReservaciones;

/**
 *
 * @author USUARIO
 */
@Repository
public class RepositorioReservaciones {
     @Autowired
    private InterfaceReservaciones crud4;
    
    public List<Reservaciones> getAll(){
        return (List<Reservaciones>) crud4.findAll();
    }
    public Optional<Reservaciones> getReservation(int id){
        return crud4.findById(id);
    }
    public Reservaciones save(Reservaciones reservacion){
        return crud4.save(reservacion);
    }
     public void delete(Reservaciones reservacion){
        crud4.delete(reservacion);
    }
   
}
