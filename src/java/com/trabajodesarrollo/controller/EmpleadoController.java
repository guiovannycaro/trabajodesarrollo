
package com.trabajodesarrollo.controller;

import com.trabajodesarrollo.Facade.EmpleadoFacade;
import com.trabajodesarrollo.pojo.Empleados;

import java.util.ArrayList;
import java.util.List;


public class EmpleadoController {

    List<Empleados> lisEmpleados = new ArrayList<>();

    public List<Empleados> getLisbenCuenta() {
        return lisEmpleados;
    }

    public List consempleado(String docempleado) {
        EmpleadoFacade empleado = new EmpleadoFacade();
        int idempleado = Integer.parseInt(docempleado);
        return lisEmpleados = empleado.listByIdEmpleado(idempleado, "idempleado", "ASC");
    }

    public static String ingresarEmpleado(String nombre, String apellidos, String idrol,
            String tipodocumento, String numerodoc) {
       EmpleadoFacade empleado = new EmpleadoFacade();
        Empleados obj = new Empleados();

        obj.setNombre(nombre);
        obj.setApellidos(apellidos);
        obj.setTipodocumento(tipodocumento);
        obj.setNumerodoc(Integer.parseInt(numerodoc));

        String alerta = "";
        alerta = empleado.CrearEmpleado(obj);

        return alerta;

    }
}
