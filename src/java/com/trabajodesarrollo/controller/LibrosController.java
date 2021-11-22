/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trabajodesarrollo.controller;

import com.trabajodesarrollo.pojo.Libros;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class LibrosController {
    
     List<Libros> lisLibros = new ArrayList<>();

    public List<Libros> getLisLibros() {
        return lisLibros;
    }
}
