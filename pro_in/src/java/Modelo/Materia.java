/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author USUARIO
 */
public class Materia {
    int id_mate;
    String nombre_materia;

    public Materia(int id_mate, String nombre_materia) {
        this.id_mate = id_mate;
        this.nombre_materia = nombre_materia;
    }

    public Materia() {
    }

    public int getId_mate() {
        return id_mate;
    }

    public void setId_mate(int id_mate) {
        this.id_mate = id_mate;
    }

    public String getNombre_materia() {
        return nombre_materia;
    }

    public void setNombre_materia(String nombre_materia) {
        this.nombre_materia = nombre_materia;
    }
    
    
}
