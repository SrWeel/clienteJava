/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author blass
 */
public class Pais {
    int id;
    String paisnombre;

    public Pais() {
    }

    public Pais(int id, String paisnombre) {
        this.id = id;
        this.paisnombre = paisnombre;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPaisnombre() {
        return paisnombre;
    }

    public void setPaisnombre(String paisnombre) {
        this.paisnombre = paisnombre;
    }
    
    
}
