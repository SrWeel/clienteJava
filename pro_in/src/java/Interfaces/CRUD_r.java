/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Modelo.Reserva;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public interface CRUD_r {
    public List listar();
    public Reserva list(int idr);
    public boolean add(Reserva res);
    
    public boolean edit(Reserva res);
                        // 2
    public boolean delete(int idr);
}
