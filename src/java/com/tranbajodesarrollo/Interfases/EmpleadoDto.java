/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tranbajodesarrollo.Interfases;

import com.trabajodesarrollo.pojo.Empleados;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public interface EmpleadoDto {

    public String CrearEmpleado(Empleados obj);


//listar los Empleados
    public List<Empleados> listByIdEmpleado(Integer idempleado, String attrOrder, String ascDesc);

    
//editar los Empleados
    public void edit(Empleados obj, String err);

    public void delete(Empleados empleado, String err);

//buscar los Empleados
    public Empleados findByNomEmpleado(String nombre);
}
