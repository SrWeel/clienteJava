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
public class Reserva {
   int idr;
   String origen;
   String destino;
   String fecha;
   String npasajeros;

    public Reserva() {
    }

    public Reserva(String origen, String destino, String fecha, String npasajeros) {
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
        this.npasajeros = npasajeros;
    }

    public int getIdr() {
        return idr;
    }

    public void setIdr(int idr) {
        this.idr = idr;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNpasajeros() {
        return npasajeros;
    }

    public void setNpasajeros(String npasajeros) {
        this.npasajeros = npasajeros;
    }
   
}
