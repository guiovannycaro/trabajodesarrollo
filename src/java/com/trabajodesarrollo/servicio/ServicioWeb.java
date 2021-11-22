
package com.trabajodesarrollo.servicio;

import com.trabajodesarrollo.controller.EmpleadoController;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(serviceName = "WSBiblioteca")
public class ServicioWeb {

    EmpleadoController emp = new EmpleadoController();

    @WebMethod(operationName = "consultarEmpleado")
    public List consultarEmpleado(
            @WebParam(name = "docben") String docben) {
        return emp.consempleado(docben);
    }

    @WebMethod(operationName = "InsertarEmpleado")
    public String crearEmpleado(
            @WebParam(name = "nombre") String nombre,
            @WebParam(name = "apellidos") String apellidos,
            @WebParam(name = "idrol") String idrol,
            @WebParam(name = "tipodocumento") String tipodocumento,
            @WebParam(name = "numerodoc") String numerodoc
    ) {
        String messaage = "";

        return messaage = EmpleadoController.ingresarEmpleado(
                nombre, apellidos, idrol, tipodocumento, numerodoc);
    }

}
