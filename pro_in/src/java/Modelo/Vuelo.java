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
public class Vuelo {
    int idv;
    float precio;
    String fsalida;
    String duracion;
    String psalida;
    String csalida;
    String pllegada;
    String cllegada;

    public Vuelo() {
    }

    public Vuelo(float precio, String fsalida, String duracion, String psalida, String csalida, String pllegada, String cllegada) {
        this.precio = precio;
        this.fsalida = fsalida;
        this.duracion = duracion;
        this.psalida = psalida;
        this.csalida = csalida;
        this.pllegada = pllegada;
        this.cllegada = cllegada;
    }

    public int getIdv() {
        return idv;
    }

    public void setIdv(int idv) {
        this.idv = idv;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getFsalida() {
        return fsalida;
    }

    public void setFsalida(String fsalida) {
        this.fsalida = fsalida;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getPsalida() {
        return psalida;
    }

    public void setPsalida(String psalida) {
        this.psalida = psalida;
    }

    public String getCsalida() {
        return csalida;
    }

    public void setCsalida(String csalida) {
        this.csalida = csalida;
    }

    public String getPllegada() {
        return pllegada;
    }

    public void setPllegada(String pllegada) {
        this.pllegada = pllegada;
    }

    public String getCllegada() {
        return cllegada;
    }

    public void setCllegada(String cllegada) {
        this.cllegada = cllegada;
    }
    
    
}
