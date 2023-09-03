/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Modelo.Travel;
import java.util.List;

/**
 *
 * @author oppsr
 */
public interface CRUD_travel {
    
    public Travel list(int id);
    
    public List listar();
                      
    public boolean add(Travel tr);
    
    public boolean edit(Travel tr);
                        // 2
    public boolean delete(int id);
}
