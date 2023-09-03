/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Modelo.Vuelo;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public interface CRUD_v {
    public List listar();
    public Vuelo list(int idv);
    public boolean add(Vuelo vue);
    
    public boolean edit(Vuelo vue);
                        // 2
    public boolean delete(int idv);
}
