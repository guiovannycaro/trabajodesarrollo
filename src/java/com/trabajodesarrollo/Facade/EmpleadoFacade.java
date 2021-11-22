package com.trabajodesarrollo.Facade;

import com.trabajodesarrollo.dto.empleadoDto;
import com.trabajodesarrollo.pojo.Empleados;
import com.tranbajodesarrollo.Interfases.EmpleadoDto;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoFacade implements EmpleadoDto {



    @Override
    public List<Empleados> listByIdEmpleado(Integer idempleado, String attrOrder, String ascDesc) {
   empleadoDto emp = new empleadoDto();
        String sql = "SELECT  empleados.idempleado."
                + " empleados.nombre,"
                + " empleados.apellidos,"
                + " empleados.tipodocumento,"
                + " empleados.numero,"
                + " empleados.idrol "
                + " FROM empleados"
                + " WHERE empleados.idempleado = '" + idempleado + "'"
                + " ORDER BY empleados." + attrOrder + " " + ascDesc;

        List<Empleados> lstR = new ArrayList<>();
        List<Object[]> lst = emp.consListEmpleados(sql);
        for (Object[] obj : lst) {
            Empleados e = new Empleados();

            e.setNombre((String) obj[1]);
            e.setApellidos((String) obj[2]);
            e.setNumerodoc(3);
            lstR.add(e);
        }

        return lstR;
    }

    @Override
    public String CrearEmpleado(Empleados obj) {
   empleadoDto emp = new empleadoDto();
        String alert = "";
        String sql = "iNSERT INTO   empleados "
                + " (empleados.nombre  ,"
                + " empleados.apellidos  ,"
                + " empleados.tipodocumento  ,"
                + " empleados.numero  ,"
                + " empleados.idrol  ) values "
                + " (" + obj.getNombre() + "  ,"
                + " '" + obj.getApellidos() + "'  ,"
                + " '" + obj.getTipodocumento() + " ' ,"
                + " '" + obj.getNumerodoc() + "'  ,"
                + " '" + obj.getIdrol() + "' ) ; ";

        alert = emp.Crear(sql);

        return alert;

    }

    @Override
    public void edit(Empleados obj, String err) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Empleados empleado, String err) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Empleados findByNomEmpleado(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
