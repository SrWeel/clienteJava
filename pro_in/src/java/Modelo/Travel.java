/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author oppsr
 */
public class Travel {
    
    int id;
    int id_ciudad;
    String id_pais;
    String id_paisd;
    String nombre;
    String nombre_cliente;
    String fecha;
    String pasajeros;
    float precio;

    public Travel() {
    }

    public Travel(int id, String id_pais, String id_paisd, int id_ciudad, String nombre, String nombre_cliente, String fecha, String pasajeros, float precio) {
        this.id = id;
        this.id_pais = id_pais;
        this.id_pais = id_paisd;
        this.id_ciudad = id_ciudad;
        this.nombre = nombre;
        this.nombre_cliente = nombre_cliente;
        this.fecha = fecha;
        this.pasajeros = pasajeros;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getId_pais() {
        return id_pais;
    }

    public void setId_pais(String id_pais) {
        this.id_pais = id_pais;
    }

    public int getId_ciudad() {
        return id_ciudad;
    }

    public void setId_ciudad(int id_ciudad) {
        this.id_ciudad = id_ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(String pasajeros) {
        this.pasajeros = pasajeros;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getId_paisd() {
        return id_paisd;
    }

    public void setId_paisd(String id_paisd) {
        this.id_paisd = id_paisd;
    }
}