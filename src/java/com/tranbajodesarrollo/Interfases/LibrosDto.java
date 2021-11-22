/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tranbajodesarrollo.Interfases;

import com.trabajodesarrollo.pojo.Libros;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public abstract class  LibrosDto {

//lCrear los Libros
    public abstract String CrearLibros(Libros obj);
//listar los Libros

    public abstract List<Libros> listByIdEmpleado(Integer idlibros, String attrOrder, String ascDesc);
//editar los Libros

    public abstract void edit(Libros obj, String err);
//borrar los Libros

    public abstract  void delete(Libros empleado, String err);
//buscar los Libros

    public abstract Libros findByNomLibros(String nombre);
}
