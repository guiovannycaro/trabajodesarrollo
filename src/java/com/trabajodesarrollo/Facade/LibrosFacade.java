package com.trabajodesarrollo.Facade;


import com.trabajodesarrollo.pojo.Libros;
import com.tranbajodesarrollo.Interfases.LibrosDto;
import java.util.ArrayList;
import java.util.List;

public class LibrosFacade extends LibrosDto {

    public LibrosFacade() {
    }
    
    @Override
    public String CrearLibros(Libros obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Libros> listByIdEmpleado(Integer idlibros, String attrOrder, String ascDesc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void edit(Libros obj, String err) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Libros empleado, String err) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Libros findByNomLibros(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



    

}
