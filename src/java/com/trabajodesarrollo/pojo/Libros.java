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
public class Libros {
    
    int idlibro;
    String nombre;
    String autor;
    String edicion;
    String descripcion;
    String ano;
    String idseccion;
    String idclasificacion;

    public Libros() {
    }

    public Libros(int idlibro, String nombre, String autor, String edicion, String descripcion, String ano, String idseccion, String idclasificacion) {
        this.idlibro = idlibro;
        this.nombre = nombre;
        this.autor = autor;
        this.edicion = edicion;
        this.descripcion = descripcion;
        this.ano = ano;
        this.idseccion = idseccion;
        this.idclasificacion = idclasificacion;
    }

    public int getIdlibro() {
        return idlibro;
    }

    public void setIdlibro(int idlibro) {
        this.idlibro = idlibro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getIdseccion() {
        return idseccion;
    }

    public void setIdseccion(String idseccion) {
        this.idseccion = idseccion;
    }

    public String getIdclasificacion() {
        return idclasificacion;
    }

    public void setIdclasificacion(String idclasificacion) {
        this.idclasificacion = idclasificacion;
    }
    
    
    
    
    

}
