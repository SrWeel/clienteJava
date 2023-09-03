/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Modelo.Alumno;
import Modelo.Usuario;
import java.util.List;

/**
 *
 * @author DELL
 */
public interface CRUD {
    
    public List listar();
                        // 2
    public Alumno list(int id);
   // {'172236464644','Junito Perez','sdsd@gmail.com'}
    public boolean add(Alumno alu);
    
    public boolean edit(Alumno alu);
                        // 2
    public boolean delete(int id);
    
 
    
}
