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
public class Clase {
    int id_cla;
    int id_alumno;
    int id_materia;
    String nombre_profesor;
    String paralelo;
    String semestre;
    String nombre_materia;
    String nombre_alu;

    public Clase() {
    }

    public Clase(int id_cla, int id_alumno, int id_materia, String nombre_profesor, String paralelo, String semestre) {
        this.id_cla = id_cla;
        this.id_alumno = id_alumno;
        this.id_materia = id_materia;
        this.nombre_profesor = nombre_profesor;
        this.paralelo = paralelo;
        this.semestre = semestre;
        this.nombre_materia = nombre_materia;
        this.nombre_alu = nombre_alu;
    }

    

    public int getId_cla() {
        return id_cla;
    }

    public void setId_cla(int id_cla) {
        this.id_cla = id_cla;
    }

    public int getId_alumno() {
        return id_alumno;
    }

    public void setId_alumno(int id_alumno) {
        this.id_alumno = id_alumno;
    }

    public int getId_materia() {
        return id_materia;
    }

    public void setId_materia(int id_materia) {
        this.id_materia = id_materia;
    }

    public String getNombre_profesor() {
        return nombre_profesor;
    }

    public void setNombre_profesor(String nombre_profesor) {
        this.nombre_profesor = nombre_profesor;
    }

    public String getParalelo() {
        return paralelo;
    }

    public void setParalelo(String paralelo) {
        this.paralelo = paralelo;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }
    
    public String getNombre_materia() {
        return nombre_materia;
    }

    public void setNombre_materia(String nombre_materia) {
        this.nombre_materia = nombre_materia;
    }

    public String getNombre_alu() {
        return nombre_alu;
    }

    public void setNombre_alu(String nombre_alu) {
        this.nombre_alu = nombre_alu;
    }
    
    
    
}
