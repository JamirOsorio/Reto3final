/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Reto5.Interface;

import Reto5.Modelo.Cliente;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Ivan Vanegas
 */
public interface InterfaceCliente extends CrudRepository<Cliente,Integer>{
    
}
