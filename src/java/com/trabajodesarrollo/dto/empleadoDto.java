/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trabajodesarrollo.dto;

import com.trabajodesarrollo.db.Conexion;
import com.trabajodesarrollo.pojo.Empleados;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class empleadoDto {

    Conexion cnn = new Conexion();
    Connection con;
    PreparedStatement st;
    ResultSet rs;

    public List consListEmpleados(String sql) {
        ArrayList<Empleados> list = new ArrayList<>();
        try {
            con = cnn.getConnection();
            st = con.prepareStatement(sql);
            rs = st.executeQuery();
            while (rs.next()) {
                Empleados est = new Empleados();
                est.setIdempleado(rs.getInt("idempleado"));
                est.setNombre(rs.getString("nombre"));
                est.setApellidos(rs.getString("apellidos"));
                est.setTipodocumento(rs.getString("tipodoc"));
                list.add(est);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;

    }

    public String Crear(String sql) {
        String mensaje = "";
        try {
            con = cnn.getConnection();
            st = con.prepareStatement(sql);
            st.executeUpdate();
           st.close();
            con.close();
            
             mensaje = "El registro  ha sido ingresado";
        } catch (Exception e) {
            
            mensaje = "El registro no ha sido ingresado";
        }
        return mensaje;
    }

}
