/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trabajodesarrollo.pojo;

/**
 *
 * @author Lenovo
 */
public class Empleados {

    int idempleado;
    String nombre;
    String apellidos;
    String idrol;
    String tipodocumento;
    int numerodoc;

    public Empleados() {
    }

    public Empleados(int idempleado, String nombre, String apellidos, String idrol, String tipodocumento, int numerodoc) {
        this.idempleado = idempleado;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.idrol = idrol;
        this.tipodocumento = tipodocumento;
        this.numerodoc = numerodoc;
    }
    
    

    public int getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(int idempleado) {
        this.idempleado = idempleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getIdrol() {
        return idrol;
    }

    public void setIdrol(String idrol) {
        this.idrol = idrol;
    }

    public String getTipodocumento() {
        return tipodocumento;
    }

    public void setTipodocumento(String tipodocumento) {
        this.tipodocumento = tipodocumento;
    }

    public int getNumerodoc() {
        return numerodoc;
    }

    public void setNumerodoc(int numerodoc) {
        this.numerodoc = numerodoc;
    }
    
    
    

}
